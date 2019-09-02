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
    private String login;
    private String cpf;
    private String senha;
    
    // método construtor vazio da classe
    public Usuario(){
        
    }
    //método construtor da classe
    public Usuario(int codigo, String nome, String login, String cpf, String senha){
        
        this.codigo = codigo;
        this.nome = nome;
        this.login = login;
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
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return this.login;
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
