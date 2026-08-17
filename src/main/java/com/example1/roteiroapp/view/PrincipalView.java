package com.example1.roteiroapp.view;

import com.example1.roteiroapp.model.User;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrincipalView {

    private User user;

    public PrincipalView(User user) {
        this.user = user;
    }

    public void mostrar(Stage stage) {

        Label titulo = new Label("Roteiro-App");

        Label saudacao = new Label(
                "Olá, " + user.getNome() + "!"
        );

        Label projetos = new Label(
                "Seus projetos"
        );

        Button sairButton = new Button(
                "Log out"
        );

        sairButton.setOnAction(event -> {
            stage.close();
        });

        VBox layout = new VBox(20);

        layout.setPadding(new Insets(30));
        layout.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(
                titulo,
                saudacao,
                projetos,
                sairButton
        );

        Scene scene = new Scene(layout, 1000, 500);

        stage.setTitle("Roteiro-App");
        stage.setScene(scene);
        stage.show();
    }
}