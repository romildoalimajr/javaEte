/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDao;

import com.mysql.jdbc.PreparedStatement;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelBean.Usuario;

/**
 *
 * @author ALPHA OMEGA
 */
public class UsuarioDao {
    
    private Connection com = null;
    
    public UsuarioDao(){
        com = ConnectionFactory.getConnection();
    }
    public boolean salvarUsuario(Usuario usuarios){
    
    String sql = "INSERT INTO usuario (codigo, nome, login, cpf, senha) VALUES (DEFAULT,?,?,?,?);";
    
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
        try {
            stmt = (PreparedStatement) com.prepareStatement(sql);
            
            stmt.setString(2, usuarios.getNome());
            stmt.setString(3, usuarios.getLogin());
            stmt.setString(4, usuarios.getCpf());
            stmt.setString(5, usuarios.getSenha());
            
            stmt.execute();
            
            com.close();
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
            
            return false;
        }finally{
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) com, stmt);
        }
    }
    public String conectarUsuario(Usuario login, Usuario senha){
        String sql = "SELECT INTO usuario WHERE login=? and senha=?";
        
        PreparedStatement stmt = null;
        
        try {
            stmt.setString(1, login.getLogin());
            stmt.setString(2, senha.getSenha());
            
            stmt.execute();
          
            com.close();
            
            
        } catch (SQLException ex) {
            System.err.println("erro " + ex);
            
        }   
        return null;
    }
}
