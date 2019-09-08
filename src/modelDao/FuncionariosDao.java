/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDao;

import conexao.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelBean.Funcionarios;



/**
 *
 * @author Romildo A. Lima Jr.
 */
public class FuncionariosDao {
    private DataSource dataSource;
    
    public FuncionariosDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void cadastroFuncionarios(String nome, String cpf, String telefone, String funcao ){
        
        DataSource dataSource = new DataSource();
        
        try {
           
            PreparedStatement ps = dataSource.getConnection().prepareStatement("INSERT INTO funcionarios (nome, cpf, telefone, funcao) "
                + "VALUES (?,?,?,?);");
            
            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, telefone);
            ps.setString(4, funcao);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Funcionário!");
            System.err.println("Deu merda " + ex.getMessage());
        }finally{
            dataSource.closeDataSource();
        }
    }
    
    public ArrayList<Funcionarios> readAll(){
        
        try{
            String sql = "SELECT * FROM funcionarios";
            
            PreparedStatement ps = dataSource.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<Funcionarios> lista = new ArrayList<Funcionarios>();
            
            while(rs.next()){
                Funcionarios funcionario = new Funcionarios();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setFuncao(rs.getString("funcao"));
                funcionario.setTelefone(rs.getString("telefone"));
                lista.add(funcionario);
            }
            ps.close();
            return lista;
        }
        catch(SQLException ex){
            System.err.println("Erro ao recuperar..."+ ex.getMessage());
        }
        catch(Exception ex){
            System.err.println("Erro geral..."+ ex.getMessage());
        }
        return null;
    }
    
    
}
