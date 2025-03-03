package com.lucasvm;

import java.util.ArrayList;

public class Usuario {

    int id;
    String nome;
    String email;
    int idade;

    public Usuario(int id, String nome, String email, int idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    @Override
    public String toString() {
       return ("ID: " + id + " | Nome: " + nome + " | Email: " + email + " | Idade: " + idade);
    }
}
