package com.example1.roteiroapp.database;
// se voce entende a arquitetura deste sistema sabe pq factory kkkkk

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:sqlite:dados/roteiro.db";

    public static Connection conectar() {

        try {
            return DriverManager.getConnection(URL);

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados.", e);
        }
    }
}