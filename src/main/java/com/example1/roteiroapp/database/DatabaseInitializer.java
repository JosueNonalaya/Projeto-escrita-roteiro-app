package com.example1.roteiroapp.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {

    public static void inicializar() {

        String sql = """
                CREATE TABLE IF NOT EXISTS user (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nome TEXT NOT NULL,
                    idade INTEGER NOT NULL,
                    email TEXT NOT NULL UNIQUE,
                    senha TEXT NOT NULL
                );
                """;

        try (Connection connection = ConnectionFactory.conectar();
             Statement statement = connection.createStatement()) {

            statement.execute(sql);

            System.out.println("Banco de dados inicializado!");

        } catch (SQLException e) {
            throw new RuntimeException(
                    "Erro ao inicializar banco de dados.",
                    e
            );
        }
    }
}