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
