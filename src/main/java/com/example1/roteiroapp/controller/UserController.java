package com.example1.roteiroapp.controller;

import com.example1.roteiroapp.dao.UserDAO;
import com.example1.roteiroapp.model.User;

import java.util.List;

public class UserController {

    private UserDAO userDAO;

    public UserController() {
        userDAO = new UserDAO();
    }

    public User cadastrar(String nome,int idade, String email, String senha) {

        User user = new User(nome, idade, email, senha);

        userDAO.inserir(user);
        return user;
    }

    public User login(String email, String senha) {

        User user = userDAO.buscarPorEmail(email);

        if (user != null && user.getSenha().equals(senha)) {
            return user;
        }

        return null;
    }
}