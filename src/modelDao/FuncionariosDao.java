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
    public boolean alterarFuncionarios(){
        boolean alterar = false;
        
        DataSource dataSource = new DataSource();
       
        try{
             String sql = "UPDATE funcionarios SET nome=?, cpf=?, telefone=?, funcao=?;";
             
             PreparedStatement ps = dataSource.getConnection().prepareStatement(sql);
//             ps.setString(1, setNome("nome").getText());
//             ps.setString(2, setCpf("cpf").getText());
//             ps.setString(3, setTelefone("telefone").getText());
//             ps.setString(4, setFuncao("funcao").getText());
             
             int rowsUpdated = ps.executeUpdate();
             
             if(rowsUpdated > 0){
                 JOptionPane.showMessageDialog(null, "Alteração efetuada!");
             }
             return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Nada foi alterado!..." + ex);
        }
       return false;
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
    public ArrayList<Funcionarios> buscaFuncionarios(){
        DataSource dataSource = new DataSource();
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        String sql = "SELECT * FROM funcionarios";
        
        ArrayList<Funcionarios> func = new ArrayList<>();
        
        try {
            stmt = dataSource.getConnection().prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Funcionarios funcionario = new Funcionarios();
                
                funcionario.setId(rs.getInt("codigo"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setFuncao(rs.getString("funcao"));
                funcionario.toString();
            }
        } catch (SQLException ex) {
            System.err.println("Deu ruim.... " +ex);
        }
        return func;   
    }
}
