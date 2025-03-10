package com.lucasvm.models;

import java.util.logging.Logger;

public class Usuario {

    Logger logger = Logger.getLogger("UsuarioDAO");
    private int id;
    private String nome;
    private String email;
    private int idade;

    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Email: " + email + " | Idade: " + idade;
    }

}
