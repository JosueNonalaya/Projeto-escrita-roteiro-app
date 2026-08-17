package com.example1.roteiroapp.model;

import com.example1.roteiroapp.enums.Generos;
import com.example1.roteiroapp.enums.Status;

import java.time.LocalDate;
import java.util.List;

public class Projeto {
    //ATRIBUTOS
    private int id;
    private String nome;
    private LocalDate dataCriacao;
    private Status status;
    private String descricao;
    private User autor;
    private int duracao;
    private List<Generos> generos;

    //SETTERS E GETTERS
    public int getId() {
        return id;
    }
    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //dataCriacao
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    //status
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    //descricao
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //autor
    public User getAutor() {
        return autor;
    }
    public void setAutor(User autor) {
        this.autor = autor;
    }
    //duracao
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    //genero
    public List<Generos> getGeneros() {
        return generos;
    }
    public void setGeneros(List<Generos> generos) {
        this.generos = generos;
    }


    //METODOS
    public void adicionarGenero(Generos genero) {
        this.generos.add(genero);
    }

    public void removerGenero(Generos genero) {
        this.generos.remove(genero);
    }
}
