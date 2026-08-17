package com.example1.roteiroapp.dao;

import com.example1.roteiroapp.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private static final String ARQUIVO = "dados/users.dat";

    private List<User> lerArquivo() {

        File arquivo = new File(ARQUIVO);

        if (!arquivo.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(arquivo))) {

            return (List<User>) ois.readObject();

        } catch (EOFException e) {

            return new ArrayList<>();

        } catch (IOException | ClassNotFoundException e) {

            throw new RuntimeException("Erro ao carregar usuários", e);
        }
    }

    private void gravarArquivo(List<User> users) {

        try {

            File pasta = new File("dados");

            if (!pasta.exists()) {
                pasta.mkdirs();
            }

            try (ObjectOutputStream oos =
                         new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {

                oos.writeObject(users);
            }

        } catch (IOException e) {

            throw new RuntimeException("Erro ao salvar usuários", e);
        }
    }

    // CREATE
    public void inserir(User user) {

        List<User> users = lerArquivo();

        user.setId(gerarNovoId(users));

        users.add(user);

        gravarArquivo(users);
    }

    // READ
    public List<User> listarTodos() {
        return lerArquivo();
    }

    // UPDATE
    public void atualizar(User userAtualizado) {

        List<User> users = lerArquivo();

        for (int i = 0; i < users.size(); i++) {

            User user = users.get(i);

            if (user.getId() == userAtualizado.getId()) {

                users.set(i, userAtualizado);
                gravarArquivo(users);
                return;
            }
        }
    }

    // DELETE
    public void excluir(int id) {

        List<User> users = lerArquivo();

        users.removeIf(user -> user.getId() == id);

        gravarArquivo(users);
    }

    private int gerarNovoId(List<User> users) {

        int maiorId = 0;

        for (User user : users) {

            if (user.getId() > maiorId) {
                maiorId = user.getId();
            }
        }

        return maiorId + 1;
    }
}