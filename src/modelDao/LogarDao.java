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

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class LogarDao {
    private DataSource dataSource;
    
    public LogarDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
   public boolean login(String login, String senha){
        
       boolean check = false;
       
        try{
            String sql = "SELECT * FROM usuario WHERE login=? AND senha=?";
            
           try (PreparedStatement ps = dataSource.getConnection().prepareStatement(sql)) {
               ps.setString(1, login);
               ps.setString(2, senha);
               ResultSet rs = ps.executeQuery();
               
               if(rs.next()){
                   check = true;
               }
           }
            dataSource.closeDataSource();
            return check;
        }
        catch(SQLException ex){
         System.err.println("Erro ao recuperar..."+ ex.getMessage()) ;  
        }
        catch(Exception ex){
            System.err.println("Erro geral..."+ ex.getMessage());
        }
        return false;
    }
}
