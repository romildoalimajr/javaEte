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
public class Produtos {
    
    private int codigo;
    private String nome;
    private String descricao;
    private int quantidade;
    private double compra;
    private double venda;
    
    public Produtos(){
        
    }
    public Produtos(int codigo, String nome, String descricao, int quantidade, double compra, double venda){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.compra = compra;
        this.venda = venda;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setCompra(double compra){
        this.compra = compra;
    }
    public double getCompra(){
        return compra;
    }
    public void setVenda(double venda){
        this.venda = venda;
    }
    public double getVenda(){
        return venda;
    }
}
