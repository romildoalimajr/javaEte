/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public  class TesteConexao {
    
    public static void main (String args[]){
        
        ConnectionFactory com = new ConnectionFactory();
        
        ConnectionFactory.getConnection();
        
        if (ConnectionFactory.getConnection()!= null){
            System.out.println("Conexão Bem Sucedida!");
            ConnectionFactory.closeConnection((Connection) com);
            System.out.println("Conexão Fechada");
    }else{
            System.out.println("Falha na Conexão!");
        }
        
       
    }
}