package com.lucasvm;

public class Main {
    public static void main(String[] args) {

        DatabaseConnectionMySQL connection1 = new DatabaseConnectionMySQL("localhost", 3306, "myDB", "root", "123456");

        connection1.connect();

        connection1.editarUsuario(15, "Lucas", "lucas@email.com", 24 );

        connection1.disconnect();
    }
}
