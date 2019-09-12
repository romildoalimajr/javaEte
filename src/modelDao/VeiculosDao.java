/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDao;

import conexao.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class VeiculosDao {
    private DataSource dataSource;
    
        public VeiculosDao(DataSource dataSource){
            
            this.dataSource = dataSource;
        }

    public void cadastroVeiculos(String placa, String cor, String ano, String modelo, String fabricante,
            String responsavel, String email, String telefone, String descricao, String data, String hora){
        
        DataSource dataSource = new DataSource();
        
        try {
            String sql = "INSERT INTO veiculos (placa, cor, ano, modelo, fabricante, "
                    + "responsavel, email, telefone, descricao, data, hora) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
           
            PreparedStatement ps = dataSource.getConnection().prepareStatement(sql);
           
            ps.setString(1, placa);
            ps.setString(2, cor);
            ps.setString(3, ano);
            ps.setString(4, modelo);
            ps.setString(5, fabricante);
            ps.setString(6, responsavel);
            ps.setString(7, email);
            ps.setString(8, telefone);
            ps.setString(9, descricao);
            ps.setString(10, data);
            ps.setString(11, hora);
            
            ps.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Veículo Cadastrado com Sucesso!");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Veículo!");
            System.err.println("Deu merda " + ex.getMessage());
        }finally{
            dataSource.closeDataSource();
            }
   }
}

    



