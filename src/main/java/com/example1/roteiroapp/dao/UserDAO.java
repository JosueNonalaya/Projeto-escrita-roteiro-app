package com.example1.roteiroapp.dao;
import com.example1.roteiroapp.database.ConnectionFactory;
import com.example1.roteiroapp.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    // CREATE
    public void inserir(User user) {

        String sql = """
                INSERT INTO user (nome, idade, email, senha)
                VALUES (?, ?, ?, ?)
                """;

        try (Connection connection = ConnectionFactory.conectar();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, user.getNome());
            statement.setInt(2, user.getIdade());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getSenha());

            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(
                    "Erro ao cadastrar usuário.",
                    e
            );
        }
    }


    // READ
    public User buscarPorEmail(String email) {

        String sql = """
                SELECT id, nome, idade, email, senha
                FROM user
                WHERE email = ?
                """;

        try (Connection connection = ConnectionFactory.conectar();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, email);

            try (ResultSet result = statement.executeQuery()) {

                if (result.next()) {

                    User user = new User(
                            result.getString("nome"),
                            result.getInt("idade"),
                            result.getString("email"),
                            result.getString("senha")
                    );

                    user.setId(result.getInt("id"));

                    return user;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(
                    "Erro ao carregar usuários.",
                    e
            );
        }

        return null;
    }

    // UPDATE


    // DELETE



}