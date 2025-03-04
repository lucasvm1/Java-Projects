package com.lucasvm.main;

import com.lucasvm.dao.DatabaseConnection;
import com.lucasvm.models.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        DatabaseConnection connection1 = new DatabaseConnection("localhost", 3306, "mydb", "root", "123456");
        connection1.connect();

        while (opcao != 7) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuarios");
            System.out.println("3 - Buscar usuario por ID");
            System.out.println("4 - Atualizar usuario");
            System.out.println("5 - Excluir usuario");
            System.out.println("6 - Transferir saldo");
            System.out.println("7 - Sair\n");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            System.out.println();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome do usuario: ");
                    String nome = sc.next();
                    System.out.print("Digite o email do usuario: ");
                    String email = sc.next();
                    System.out.print("Digite a idade do usuario: ");
                    int idade = sc.nextInt();

                    connection1.inserirUsuario(new Usuario(nome, email, idade));
                }
                case 2 -> {
                    System.out.println("===== Usuários cadastrados =====");
                    connection1.listarUsuarios();
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Digite o ID do usuario que deseja buscar: ");
                    try {
                        int id = Integer.parseInt(sc.next());
                        connection1.buscarUsuario(id);
                    } catch (NumberFormatException e) {
                        System.out.println("O caractere inserido não foi um número!");
                    }
                }
                case 4 -> {
                    System.out.println("Digite o ID do usuario a ser atualizado: ");
                    try {
                        int id = Integer.parseInt(sc.next());
                        System.out.println("Digite o novo nome do usuario: ");
                        String nome = sc.next();
                        System.out.println("Digite o novo email do usuario: ");
                        String email = sc.next();
                        System.out.println("Digite a nova idade do usuario: ");
                        int idade = sc.nextInt();

                        connection1.alterarUsuario(id, nome, email, idade);
                    } catch (NumberFormatException e) {
                        System.out.println("O caractere inserido não foi um número!");
                    }
                }
                case 5 -> {
                    System.out.println("Digite o ID do usuario para excluir: ");
                    try {
                        int id = Integer.parseInt(sc.next());
                        connection1.excluirUsuario(id);
                    } catch (NumberFormatException e) {
                        System.out.println("O caractere inserido não foi um número!");
                    }
                }
                case 6 -> {
                    System.out.println("Digite o ID do pagador: ");
                    try {
                        int idOrigem = Integer.parseInt(sc.next());
                        System.out.println("Digite o ID do recebedor: ");
                        int idDestino = Integer.parseInt(sc.next());
                        System.out.println("Digite o valor a ser transferido: ");
                        double valor = sc.nextDouble();

                        connection1.transferirSaldo(idOrigem, idDestino, valor);
                    } catch (NumberFormatException e) {
                        System.out.println("O caractere inserido não foi um número!");
                    }
                }
                case 7 -> {
                    System.out.println("Saindo...");
                }
                default -> {
                    System.out.println("Digite um numero valido!");
                }


            }

        }

        connection1.disconnect();
        System.out.println("Obrigado por usar o programa!");


    }
}