package com.example1.roteiroapp.view;

import com.example1.roteiroapp.model.User;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrincipalView {

    private User usuarioLogado;

    private ListView<String> listaConteudo;

    public PrincipalView(User user) {
        this.usuarioLogado = user;
    }

    public void mostrar(Stage stage) {

        // =========================
        // LADO ESQUERDO
        // =========================

        Button musicaButton = new Button("Música");
        Button arquivadoButton = new Button("Arquivado");
        Button finalizadoButton = new Button("Finalizado");
        Button desenvolvimentoButton =
                new Button("Em desenvolvimento");

        listaConteudo = new ListView<>();

        Button configuracoesButton =
                new Button("Configurações");

        Label perfilLabel =
                new Label("Usuário: " + usuarioLogado.getNome());

        VBox menuLateral = new VBox(10);

        menuLateral.setPadding(new Insets(20));

        menuLateral.getChildren().addAll(
                musicaButton,
                arquivadoButton,
                finalizadoButton,
                desenvolvimentoButton,
                listaConteudo,
                configuracoesButton,
                perfilLabel
        );


        // =========================
        // LADO DIREITO
        // =========================

        Label logoLabel =
                new Label("ROTEIRO-APP");

        Label boasVindasLabel =
                new Label("Bem-vindo, " + usuarioLogado.getNome() + "!");

        Label instrucao1 =
                new Label("1. Crie um novo projeto.");

        Label instrucao2 =
                new Label("2. Desenvolva seu roteiro.");

        Label instrucao3 =
                new Label("3. Organize sua produção.");

        Button novoProjetoButton =
                new Button("Novo Projeto");

        VBox areaPrincipal = new VBox(20);

        areaPrincipal.setAlignment(Pos.CENTER);

        areaPrincipal.getChildren().addAll(
                logoLabel,
                boasVindasLabel,
                instrucao1,
                instrucao2,
                instrucao3,
                novoProjetoButton
        );


        // BARRA INFERIOR
        Label rodapeLabel =
                new Label("© Roteiro-App");

        VBox rodape = new VBox();

        rodape.setPadding(new Insets(5));
        rodape.setAlignment(Pos.CENTER);

        rodape.getChildren().add(rodapeLabel);




        BorderPane root = new BorderPane();

        root.setLeft(menuLateral);
        root.setCenter(areaPrincipal);
        root.setBottom(rodape);



        musicaButton.setOnAction(event -> {
            mostrarMusicas();
        });

        arquivadoButton.setOnAction(event -> {
            mostrarProjetosArquivados();
        });

        finalizadoButton.setOnAction(event -> {
            mostrarProjetosFinalizados();
        });

        desenvolvimentoButton.setOnAction(event -> {
            mostrarProjetosEmDesenvolvimento();
        });


        Scene scene = new Scene(root, 1000, 500);

        stage.setTitle("Roteiro-App");
        stage.setScene(scene);
        stage.show();
    }


    //LADO ESQUERDO OPÇÕES DE VISUALIZAR
    private void mostrarMusicas() {

        listaConteudo.getItems().clear();

        listaConteudo.getItems().add(
                "Nenhuma música salva ainda."
        );
    }


    private void mostrarProjetosArquivados() {

        listaConteudo.getItems().clear();

        listaConteudo.getItems().add(
                "Nenhum projeto arquivado ainda."
        );
    }


    private void mostrarProjetosFinalizados() {

        listaConteudo.getItems().clear();

        listaConteudo.getItems().add(
                "Nenhum projeto finalizado ainda."
        );
    }


    private void mostrarProjetosEmDesenvolvimento() {

        listaConteudo.getItems().clear();

        listaConteudo.getItems().add(
                "Nenhum projeto em desenvolvimento."
        );
    }
}