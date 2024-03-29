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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelBean.Usuario;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class UsuarioDao {
    
    private DataSource dataSource;
    
    public UsuarioDao(DataSource dataSource){
        this.dataSource = dataSource;
        
    }
    public boolean logarUsuario(String login, String senha){
        
        boolean autenticar = false;
        
        String sql = "SELECT * FROM usuario WHERE login=? AND senha=?";
        
        try{
            PreparedStatement ps;
            try {
                ps = dataSource.getConnection().prepareStatement(sql);
            
                ps.setString(1, login);
                ps.setString(2, senha);
            
                ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                autenticar = true;
                ps.close();
                }else{
                System.err.println("Usuário ou senha não encontrado");
            }
            } catch (SQLException ex) {
                System.err.println("Deu Pau");
            }
            return autenticar;
        }finally{
            dataSource.closeDataSource();
        }
    }
    
    public void cadastroUsuario(String nome, String login, String cpf, String senha){
        
       DataSource dataSource = new DataSource();
       
        try {
            PreparedStatement ps = dataSource.getConnection().prepareStatement("INSERT INTO usuario (nome, login, cpf, senha) "
                    + "VALUES (?,?,?,?);");
            ps.setString(1, nome);
            ps.setString(2, login);
            ps.setString(3, cpf);
            ps.setString(4, senha);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
        }finally{
            dataSource.closeDataSource();
        }
    }
    public ArrayList<Usuario> readAll(){
        
        try{
            String sql = "SELECT * FROM usuario";
            
            PreparedStatement ps = dataSource.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<Usuario> lista = new ArrayList<Usuario>();
            
            while(rs.next()){
                
                Usuario usuario = new Usuario();
                
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setSenha(rs.getString("senha"));
                lista.add(usuario);
            }
            ps.close();
            return lista;
        }
        catch(SQLException ex){
         System.err.println("Erro ao recuperar..."+ ex.getMessage()) ;  
        }
        catch(Exception ex){
            System.err.println("Erro geral..."+ ex.getMessage());
        }
        return null;
    }
    
}