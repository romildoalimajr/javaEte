/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDao;

import conexao.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class ProdutosDao {
    
    private DataSource dataSource;
    
    public ProdutosDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void cadastrarProdutos(String nome, String descricao, int quantidade, double compra, double venda){
        
        
        DataSource dataSource = new DataSource();
        
        try {
            PreparedStatement ps = dataSource.getConnection().prepareStatement("INSERT INTO produtos(nome, descricao, "
                    + "quantidade, compra, venda)VALUES(?,?,?,?,?);");
            
            ps.setString(1, nome);
            ps.setString(2, descricao);
            ps.setInt(3, quantidade);
            ps.setDouble(4, compra);
            ps.setDouble(5, venda);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produtos Cadastrado com Sucesso!");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!");
        }
        finally{
            dataSource.closeDataSource();
        }
        
        
    }
}

