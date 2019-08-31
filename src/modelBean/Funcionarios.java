/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBean;

/**
 *
 * @author ALPHA OMEGA
 */
public class Funcionarios {
    
    private int id;
    private String cpf;
    private String nome;
    private String telefone;
    private String funcao;

    public Funcionarios(){
        
    }
    public Funcionarios(String cpf, String nome, String telefone, String funcao) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.funcao = funcao;
    }
    public int getId(){
        return this.id;
    }
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        this.cpf = cpf;
    }
    public String getNome(){
        return this.cpf;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    public String getFuncao(){
        return this.funcao;
    }
}
