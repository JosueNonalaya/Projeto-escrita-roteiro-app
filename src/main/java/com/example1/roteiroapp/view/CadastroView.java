package com.example1.roteiroapp.view;

import com.example1.roteiroapp.controller.UserController;
import com.example1.roteiroapp.model.User;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CadastroView {

    private UserController userController;

    public CadastroView() {
        userController = new UserController();
    }

    public void mostrar(Stage stage) {

        // Título
        Label titulo = new Label("Criar conta");

        // Campos
        TextField nomeField = new TextField();
        nomeField.setPromptText("Nome");

        TextField idadeField = new TextField();
        idadeField.setPromptText("Idade");

        TextField emailField = new TextField();
        emailField.setPromptText("E-mail");

        PasswordField senhaField = new PasswordField();
        senhaField.setPromptText("Senha");

        // Botão
        Button cadastrarButton = new Button("Cadastrar");
        cadastrarButton.setOnAction(event -> {

            try{
                String nome = nomeField.getText();
                int idade = Integer.parseInt(idadeField.getText());
                String email = emailField.getText();
                String senha = senhaField.getText();

                User user = userController.cadastrar(
                        nome,
                        idade,
                        email,
                        senha
                );

                LoginView loginView =
                        new LoginView();

                loginView.mostrar(stage);
            }


            // Depois vamos colocar aqui a navegação
            // para a PrincipalView.
            catch (NumberFormatException e){
                System.out.println(e);
            }
        });

        Button loginButton = new Button("Voltar Login");
        loginButton.setOnAction(event -> {

            LoginView loginView =
                    new LoginView();

            loginView.mostrar(stage);
        });


        // Layout
        VBox layout = new VBox(15);

        layout.setPadding(new Insets(30));
        layout.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(
                titulo,
                nomeField,
                idadeField,
                emailField,
                senhaField,
                cadastrarButton,
                loginButton
        );

        // Cena
        Scene scene = new Scene(layout, 400, 500);

        stage.setTitle("Cadastro");
        stage.setScene(scene);
        stage.show();
    }
}