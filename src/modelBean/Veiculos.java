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
public class Veiculos {
    
    private int codigo;
    private String placa;
    private String cor;
    private String ano;
    private String modelo;
    private String fabricante;
    private String responsavel;
    private String email;
    private String telefone;
    private String descricao;
    private String hora;
    private String data;
    
    public Veiculos(){
        
    }
    public Veiculos(int codigo, String placa, String cor, String ano, String modelo,
            String fabricante, String responsavel, String email, String telefone,
            String descricao, String data, String hora ){
        this.codigo = codigo;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.responsavel = responsavel;
        this.email = email;
        this.telefone = telefone;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return placa;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setAno(String ano){
        this.ano = ano;
    }
    public String getAno(){
        return ano;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getFabricante(){
        return fabricante;
    }
    public void setResponsavel(String responsavel){
        this.responsavel = responsavel;
    }
    public String getResponsavel(){
        return responsavel;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return data;
    }
    public void setHora(String hora){
        this.hora = hora;
    }
    public String getHora(){
        return hora;
    }
}

