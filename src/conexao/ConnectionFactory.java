/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Romildo A. Lima Jr.
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/oficina_quebra_tudo";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na Conexão! "+ ex);
        }
    }
    
    public static void closeConnection(Connection com){
        if (com != null){
            try {
                com.close();
            } catch (SQLException ex) {
                System.err.println("Erro!" + ex);
            }
        }
    }
    public static void closeConnection(Connection com, PreparedStatement stmt){
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro!" + ex);
            }
        }
        if (com != null){
            try {
                com.close();
            } catch (SQLException ex) {
                System.err.println("Erro!" + ex);
            }
        }
    }
    public static void closeConnection(Connection com, PreparedStatement stmt, ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro" + ex);
            }
        }
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro" + ex);
            }
        }
        if (com != null){
            try {
                com.close();
            } catch (SQLException ex) {
                System.err.println("Erro" + ex);
            }
        }
    }
}
