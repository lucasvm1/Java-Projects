package com.lucasvm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DatabaseConnectionMySQL connection1 = new DatabaseConnectionMySQL("localhost", 3306, "myDB", "root", "123456");

        connection1.connect();

        List<Usuario> usuarios = connection1.listarUsuarios();

        System.out.println("\nLista de Usuários:");
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário encontrado.");
        } else {
            for (Usuario user : usuarios) {
                System.out.println(user);
            }
        }

        connection1.disconnect();
    }
}
