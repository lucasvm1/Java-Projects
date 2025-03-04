package com.lucasvm.dao;

import com.lucasvm.models.Usuario;

import java.sql.*;
import java.util.logging.Logger;

public class DatabaseConnection {

    Logger logger = Logger.getLogger("DatabaseConnection");
    private Connection connection;
    private String host;
    private int port;
    private String user;
    private String pass;
    private String database;

    public DatabaseConnection(String host, int port, String database, String user, String pass) {
        this.host = host;
        this.port = port;
        this.database = database;
        this.user = user;
        this.pass = pass;
    }

    public void connect() {

        String url = "jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database + "?useSSL=false&serverTimezone=UTC";

        try {

            if (connection == null || connection.isClosed()) {

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    connection = DriverManager.getConnection(url, user, pass);
                    logger.info("Conectado com sucesso ao banco de dados!");
                    System.out.println("Conectado com sucesso ao banco de dados!");
                } catch (SQLException ex) {
                    logger.warning("Erro ao conectar ao banco de dados: " + ex.getMessage());
                    System.out.println("Erro ao conectar ao banco de dados: " + ex.getMessage());
                }

            }


        } catch (SQLException | ClassNotFoundException ex) {
            logger.warning("Erro ao conectar ao banco de dados: " + ex.getMessage());
            System.out.println("Erro ao conectar ao banco de dados: " + ex.getMessage());
        }


    }

    public void disconnect() {

        try {
            if (connection != null) {
                connection.close();
                logger.info("Desconectado com sucesso ao banco de dados!");
                System.out.println("Desconectado com sucesso ao banco de dados!");
            }
        } catch (SQLException ex) {
            logger.warning("Não foi possível se desconectar do banco de dados" + ex.getMessage());
            System.out.println("Erro ao conectar ao banco de dados: " + ex.getMessage());
        }

    }

    public void inserirUsuario(Usuario usuario) {

        String nome = usuario.getNome();
        String email = usuario.getEmail();
        int idade = usuario.getIdade();

        String sql = "INSERT INTO usuarios (nome, email, idade) VALUES (?, ?, ?)";

        try {
            if (connection == null || connection.isClosed()) {
                logger.warning("Não há banco de dados conectado!");
                System.out.println("Não há banco de dados conectado!");
                return;
            }

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nome);
                statement.setString(2, email);
                statement.setInt(3, idade);

                int linhasAfetadas = statement.executeUpdate();

                if (linhasAfetadas > 0) {
                    logger.info("O usuário " + nome + " foi inserido com sucesso!");
                    System.out.println("O usuário " + nome + " foi inserido com sucesso!");
                } else {
                    logger.warning("O usuário " + nome + "não foi inserido!");
                    System.out.println("O usuário " + nome + "não foi inserido!");
                }


            }

        } catch (SQLException ex) {
            logger.warning("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
            System.out.println("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
        }


    }

    public void buscarUsuario(int id) {

        String sql = "SELECT * FROM usuarios WHERE id = ?";

        try {
            if (connection == null || connection.isClosed()) {
                logger.warning("Não há banco de dados conectado!");
                System.out.println("Não há banco de dados conectado!");
                return;
            }

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);

                ResultSet rs = statement.executeQuery();

                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    int idade = rs.getInt("idade");

                    System.out.println("ID: " + id + " | Nome: " + nome + " | Email: " + email + " | Idade: " + idade);

                } else {
                    logger.warning("Usuário com ID: " + id + " não foi encontrado no banco de dados!");
                    System.out.println("Usuário com ID: " + id + " não foi encontrado no banco de dados!");
                }


            }


        } catch (SQLException ex) {
            logger.warning("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
            System.out.println("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
        }
    }

    public void listarUsuarios() {
        String sql = "SELECT * FROM usuarios";

        try {
            if (connection == null || connection.isClosed()) {
                logger.warning("Não há banco de dados conectado!");
                System.out.println("Não há banco de dados conectado!");
                return;
            }

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet rs = statement.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    int idade = rs.getInt("idade");

                    System.out.println("ID: " + id + " | Nome: " + nome + " | Email: " + email + " | Idade: " + idade);

                }
            }

        } catch (SQLException ex) {
            logger.warning("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
            System.out.println("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
        }

    }

    public void alterarUsuario(int id, String novoNome, String novoEmail, int novoIdade) {

        String sql = "update usuarios set nome = ?, email = ?, idade = ? where id = ?";

        try {
            if (connection == null || connection.isClosed()) {
                logger.warning("Não há banco de dados conectado!");
                System.out.println("Não há banco de dados conectado!");
            }

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, novoNome);
                statement.setString(2, novoEmail);
                statement.setInt(3, novoIdade);
                statement.setInt(4, id);

                int linhasAfetadas = statement.executeUpdate();
                if (linhasAfetadas > 0) {
                    logger.info("O usuário " + novoNome + " foi atualizado com sucesso!");
                    System.out.println("O usuário " + novoNome + " foi atualizado com sucesso!");
                } else {
                    logger.warning("Usuário com ID: " + id + " não foi encontrado no banco de dados!");
                    System.out.println("Usuário com ID: " + id + " não foi encontrado no banco de dados!");
                }
            }


        } catch (SQLException ex) {
            logger.warning("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
            System.out.println("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
        }
    }

    public void excluirUsuario(int id) {
        String sql = "delete from usuarios where id = ?";

        try {
            if (connection == null || connection.isClosed()) {
                logger.warning("Não há banco de dados conectado!");
                System.out.println("Não há banco de dados conectado!");
                return;
            }

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                int linhasAfetadas = statement.executeUpdate();
                if (linhasAfetadas > 0) {
                    logger.info("O usuário " + id + " foi excluido com sucesso!");
                    System.out.println("O usuário " + id + " foi excluido com sucesso!");
                } else {
                    logger.warning("Usuário com ID: " + id + " não foi encontrado no banco de dados!");
                    System.out.println("Usuário com ID: " + id + " não foi encontrado no banco de dados!");
                }
            }

        } catch (SQLException ex) {
            logger.warning("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
            System.out.println("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
        }

    }

    public void transferirSaldo(int idOrigem, int idDestino, double valor) {

        try {
            if (connection == null || connection.isClosed()) {
                logger.warning("Não há banco de dados conectado!");
                System.out.println("Não há banco de dados conectado!");
                return;
            }

            connection.setAutoCommit(false);

            String sql = "Select * from usuarios where id = ?";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, idOrigem);


                ResultSet rs = statement.executeQuery();

                double saldoOrigem = 0;

                if (rs.next()) {
                    saldoOrigem = rs.getDouble("saldo");
                }

                if (saldoOrigem < valor) {
                    logger.info("O saldo de origem é insuficiente!");
                    System.out.println("O saldo de origem é insuficiente!");
                    connection.rollback();
                    connection.setAutoCommit(true);
                } else {

                    // Retira saldo da Origem
                    String sqlUpdate1 = "UPDATE usuarios SET saldo = saldo - ? WHERE id = ?";
                    try (PreparedStatement statement1 = connection.prepareStatement(sqlUpdate1)) {
                        statement1.setDouble(1, valor);
                        statement1.setInt(2, idOrigem);
                        statement1.executeUpdate();
                    }
                    // Adiciona saldo ao Destino
                    String sqlUpdate2 = "UPDATE usuarios SET saldo = saldo + ? WHERE id = ?";
                    try (PreparedStatement statement1 = connection.prepareStatement(sqlUpdate2)) {
                        statement1.setDouble(1, valor);
                        statement1.setInt(2, idDestino);
                        statement1.executeUpdate();
                    }

                    //Adiciona linha de transações
                    String sqlInsert = "insert into transacoes (idOrigem, idDestino, valor) values (?, ?, ?)";
                    try (PreparedStatement statement1 = connection.prepareStatement(sqlInsert)) {
                        statement1.setInt(1, idOrigem);
                        statement1.setInt(2, idDestino);
                        statement1.setDouble(3, valor);
                        statement1.executeUpdate();
                    }

                }

            }

            connection.commit();

            logger.info("Transferencia realizada com sucesso!");
            System.out.println("Transferencia realizada com sucesso!");
            connection.setAutoCommit(true);

        } catch (SQLException ex) {
            logger.warning("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
            System.out.println("Não foi possivel executar comando no banco de dados: " + ex.getMessage());
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                logger.warning("O rollback não foi possível: " + ex1.getMessage());
                System.out.println("O rollback não foi possível: " + ex1.getMessage());
            }
        }

    }


}
