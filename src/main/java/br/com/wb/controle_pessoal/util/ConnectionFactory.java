package br.com.wb.controle_pessoal.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Está classe tem como funcionalidade fazer a conexão com o banco de dados
 * 
 * @author will
 */

public class ConnectionFactory {
    private static Connection connection = null;
    private static final String DB_FILE_NAME = "banco.db";

    private ConnectionFactory() {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver Carregado");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não Carregado: " + e.getMessage());
        }
    }

    public static ConnectionFactory getInstance() {
        return new ConnectionFactory();
    }

    public Connection getConnection() throws SQLException {
        try {
            File tempFile = extractResourceToFile("/" + DB_FILE_NAME);
            String dbUrl = "jdbc:sqlite:" + tempFile.getAbsolutePath();
            connection = DriverManager.getConnection(dbUrl);
            System.out.println("Conexão estabelecida");
            return connection;
        } catch (IOException e) {
            System.out.println("Falha ao extrair o arquivo do JAR para o sistema de arquivos" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Falha ao extrair o arquivo do JAR para o sistema de arquivos" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    private File extractResourceToFile(String resourcePath) throws IOException {
        File tempFile = File.createTempFile(DB_FILE_NAME, ".db");
        Files.copy(ConnectionFactory.class.getResourceAsStream(resourcePath), tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        tempFile.deleteOnExit();
        return tempFile;
    }

    public static void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
            System.out.println("ResultSet fechada");
        }
        if (ps != null) {
            ps.close();
            System.out.println("PreparedStatement fechada");
        }
        if (conn != null) {
            conn.close();
            System.out.println("Connection fechada");
        }
    }
}
