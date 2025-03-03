package com.lucasvm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DatabaseConnectionMySQL connection1 = new DatabaseConnectionMySQL("localhost", 3306, "myDB", "root", "123456");

        connection1.connect();

        Usuario usuario = connection1.buscarUsuarioId(7);

        if (usuario != null) {
            System.out.println(usuario);
        } else {
            System.out.println("Usuário não encontrado");
        }

        connection1.disconnect();
    }
}
