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
    public Funcionarios(String nome, String cpf, String telefone, String funcao) {
        
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.funcao = funcao;
    }
    public void setId(int id){
        this.id = id;
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
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
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
