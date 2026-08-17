package com.example1.roteiroapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {

    //ATRIBUTOS
    private int id;
    private String nome;
    private int idade;
    private String email;
    private String senha;
    private List<Projeto> projetos;

    //CONSTRUTOR
    public User(String nome, int idade, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.projetos = new ArrayList<>();
    }

    //GETTERS E SETTERS
    //Id
    public int getId() {
        return id;
    }
    public void setId(int novoId) {
        this.id = id;
    }
    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    //Idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }
    //Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }
    //Senha
    public String getSenha() {
        return senha;
    }
    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }


    //METODOS
    public void adicionarProjeto(Projeto projeto){
        projetos.add(projeto);
    }
    public void removerProjeto(Projeto projeto){
        projetos.remove(projeto);
    }
    public List<Projeto> getProjetos(){
        return projetos;
    }
}