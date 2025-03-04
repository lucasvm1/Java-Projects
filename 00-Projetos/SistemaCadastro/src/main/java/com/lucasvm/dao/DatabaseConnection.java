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
                    logger.info("Connected to database");
                } catch (SQLException ex) {
                    logger.warning("Could not connect to database: " + ex.getMessage());
                }

            }


        } catch (SQLException | ClassNotFoundException ex) {
            logger.warning("Could not connect to database: " + ex.getMessage());
        }


    }

    public void disconnect() {

        try {
            if (connection != null) {
                connection.close();
                logger.info("Disconnected from database");
            }
        } catch (SQLException ex) {
            logger.warning("Could not disconnect from database: " + ex.getMessage());
        }

    }

    public void inserirUsuario(Usuario usuario) {

        String nome = usuario.getNome();
        String email = usuario.getEmail();
        int idade = usuario.getIdade();

        String sql = "INSERT INTO usuarios (nome, email, idade) VALUES (?, ?, ?)";

        try {
            if (connection == null || connection.isClosed()) {
                logger.warning("Database not connected!");
                return;
            }

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nome);
                statement.setString(2, email);
                statement.setInt(3, idade);

                int linhasAfetadas = statement.executeUpdate();

                if (linhasAfetadas > 0) {
                    logger.info("User " + nome + " was added successfully!");
                } else {
                    logger.warning("User " + nome + " was not added! An error occurred!");
                }


            }

        } catch (SQLException ex) {
            logger.warning("Could retrieve informations: " + ex.getMessage());
        }


    }

    public void buscarUsuario(int id) {

        String sql = "SELECT * FROM usuarios WHERE id = ?";

        try {
            if (connection == null || connection.isClosed()) {
                logger.warning("Database not connected!");
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
                    logger.warning("User ID " + id + " was not found!");
                }


            }


        } catch (SQLException e) {
            logger.warning("Could not find user: " + e.getMessage());
        }
    }

    public void listarUsuarios() {
        String sql = "SELECT * FROM usuarios";

        try {
            if (connection == null || connection.isClosed()) {
                logger.warning("Database not connected!");
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
            logger.warning("Could retrieve informations: " + ex.getMessage());
        }

    }

    public void alterarUsuario(int id, String novoNome, String novoEmail, int novoIdade) {

        String sql = "update usuarios set nome = ?, email = ?, idade = ? where id = ?";

        try {
            if (connection == null || connection.isClosed()) {
                logger.warning("Database not connected!");
            }

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, novoNome);
                statement.setString(2, novoEmail);
                statement.setInt(3, novoIdade);
                statement.setInt(4, id);

                int linhasAfetadas = statement.executeUpdate();
                if (linhasAfetadas > 0) {
                    logger.info("User " + novoNome + " was updated successfully!");
                } else {
                    logger.warning("User ID" + id + " was not found!");
                }
            }


        } catch (SQLException ex) {
            logger.warning("Could retrieve informations: " + ex.getMessage());
        }
    }

    public void excluirUsuario(int id) {
        String sql = "delete from usuarios where id = ?";

        try {
            if (connection == null || connection.isClosed()) {
                logger.warning("Database not connected!");
            }

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                int linhasAfetadas = statement.executeUpdate();
                if (linhasAfetadas > 0) {
                    logger.info("User " + id + " was removed successfully!");
                } else {
                    logger.warning("User ID " + id + " was not found!");
                }
            }

        } catch (SQLException ex) {
            logger.warning("Could retrieve informations: " + ex.getMessage());
        }

    }


}
