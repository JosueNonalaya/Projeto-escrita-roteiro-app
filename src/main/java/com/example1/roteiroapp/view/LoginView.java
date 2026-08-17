package com.example1.roteiroapp.view;

import com.example1.roteiroapp.controller.UserController;
import com.example1.roteiroapp.model.User;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView {

    private UserController userController;

    public LoginView() {
        userController = new UserController();
    }

    public void mostrar(Stage stage) {

        Label titulo = new Label("Roteiro-App");

        TextField emailField = new TextField();
        emailField.setPromptText("E-mail");

        PasswordField senhaField = new PasswordField();
        senhaField.setPromptText("Senha");

        Button entrarButton = new Button("Entrar");

        Button cadastroButton = new Button("Criar conta");

        Label mensagem = new Label();

        entrarButton.setOnAction(event -> {

            String email = emailField.getText();
            String senha = senhaField.getText();

            User user = userController.login(email, senha);

            if (user != null) {

                PrincipalView principalView =
                        new PrincipalView(user);

                principalView.mostrar(stage);

            } else {

                mensagem.setText(
                        "E-mail ou senha incorretos."
                );
            }
        });

        cadastroButton.setOnAction(event -> {

            CadastroView cadastroView =
                    new CadastroView();

            cadastroView.mostrar(stage);
        });

        VBox layout = new VBox(15);

        layout.setPadding(new Insets(30));
        layout.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(
                titulo,
                emailField,
                senhaField,
                entrarButton,
                mensagem,
                cadastroButton
        );

        Scene scene = new Scene(layout, 400, 500);

        stage.setTitle("Roteiro-App - Login");
        stage.setScene(scene);
        stage.show();
    }
}