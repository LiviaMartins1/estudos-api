package com.dest1.estudos.entity;

import com.dest1.estudos.entity.enums.escolaridade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String senha;
    private LocalDate dataNascimento;
    private escolaridade escolaridade;

    public Aluno(int id, String nome, String email, String senha, LocalDate dataNascimento, escolaridade escolaridade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.escolaridade = escolaridade;
    }

    public Aluno(String nome, String email, String senha, LocalDate dataNascimento, escolaridade escolaridade) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.escolaridade = escolaridade;
    }

    public Aluno() {
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
}
