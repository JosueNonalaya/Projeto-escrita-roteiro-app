package com.example1.roteiroapp;


import com.example1.roteiroapp.view.LoginView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        LoginView loginView = new LoginView();

        loginView.mostrar(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}