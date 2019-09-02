/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBean.dao;

import com.mysql.jdbc.PreparedStatement;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
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
    
    String sql = "INSERT INTO usuario (codigo, nome, cpf, senha) VALUES (DEFAULT,?,?,?);";
    
    PreparedStatement stmt = null;
    
        try {
            stmt = (PreparedStatement) com.prepareStatement(sql);
            
            stmt.setString(2, usuarios.getNome());
            stmt.setString(3, usuarios.getCpf());
            stmt.setString(4, usuarios.getSenha());
            
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
}
