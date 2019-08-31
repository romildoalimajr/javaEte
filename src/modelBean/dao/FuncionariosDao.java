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
import modelBean.Funcionarios;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class FuncionariosDao {
    
    private Connection com = null;
    
    public FuncionariosDao(){
        com = ConnectionFactory.getConnection();
    }
    
    public boolean salvar(Funcionarios funcionarios){
        
        
        String sql = "INSERT INTO funcionarios (nome, cpf, telefone, funcao) VALUES (?,?,?,?)";
       
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) com.prepareStatement(sql);
            
            stmt.setString(1, funcionarios.getNome());
            stmt.setString(2, funcionarios.getCpf());
            stmt.setString(3, funcionarios.getTelefone());
            stmt.setString(4, funcionarios.getFuncao());
            
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
            
            return false;
            
        }finally{
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) com, stmt);
        }
    }
}
