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