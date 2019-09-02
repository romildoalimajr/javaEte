/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBean;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class Usuario {
    
    private int codigo;
    private String nome;
    private String cpf;
    private String senha;
    
    public Usuario(){
        
    }
    public Usuario(int codigo, String nome, String cpf, String senha){
        
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return this.senha;
    }
}
