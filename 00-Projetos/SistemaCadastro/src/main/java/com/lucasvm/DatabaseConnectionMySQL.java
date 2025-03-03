package com.lucasvm;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnectionMySQL {

    private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionMySQL.class.getName());

    private String host;
    private int port;
    private String database;
    private String user;
    private String password;
    private Connection connection;

    public DatabaseConnectionMySQL(String host, int port, String database, String user, String password) {
        this.host = host;
        this.port = port;
        this.database = database;
        this.user = user;
        this.password = password;
    }

    public Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            if (connection == null || connection.isClosed()) {
                String url = "jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false&serverTimezone=UTC";
                connection = DriverManager.getConnection(url, user, password);
                LOGGER.info("Conectado ao banco de dados: " + url);
            }
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.SEVERE, "Driver JDBC não encontrado!", e);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Falha ao conectar ao banco: " + e.getMessage(), e);
        }
        return connection;
    }

    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                LOGGER.info("Conexão fechada com sucesso.");
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao fechar a conexão: " + e.getMessage(), e);
        }
    }

    public void executeSQL(String sql) {
        try {
            if (connection == null || connection.isClosed()) {
                LOGGER.warning("Tentativa de executar SQL sem conexão ativa.");
                return;
            }

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.execute();
                LOGGER.info("SQL executado com sucesso: " + sql);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao executar SQL: " + e.getMessage(), e);
        }
    }

    public List<Usuario> listarUsuarios() {

        List<Usuario> usuarios = new ArrayList<>();
        String sql = "select * from usuarios";

        try {
            if (connection == null || connection.isClosed()) {
                LOGGER.warning("Tentativa de executar SQL sem conexão ativa.");
                return usuarios;
            }

            try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet rs = statement.executeQuery()) {

                while (rs.next()) {

                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    int idade = rs.getInt("idade");

                    usuarios.add(new Usuario(id, nome, email, idade));
                }

                LOGGER.info("Listagem de usuários concluidos!");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao executar SQL: " + e.getMessage(), e);
        }

        return usuarios;

    }

    public Usuario buscarUsuarioId(int idUsuario) {

        String sql = "select * from usuarios where id = ?";

        try {
            if (connection == null || connection.isClosed()) {
                LOGGER.warning("Tentativa de executar SQL sem conexão ativa.");
                return null;
            }

            try (PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setInt(1, idUsuario);

                try (ResultSet rs = statement.executeQuery()) {
                    if (rs.next()) {
                        int id = rs.getInt("id");
                        String nome = rs.getString("nome");
                        String email = rs.getString("email");
                        int idade = rs.getInt("idade");

                        return new Usuario(id, nome, email, idade);
                    } else {
                        return null;
                    }
                }


            }

        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao buscar usuário por ID: " + idUsuario, e);
            return null;
        }


    }

}
