/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class DescriptaSenha {
    
    public static boolean descriptaSenha(String login, String senha){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(senha.getBytes(StandardCharsets.UTF_8));
            
            StringBuilder sb = new StringBuilder();
                for(byte b : messageDigest){
                    sb.append(String.format("%02X", 0xFF & b));
                }
                senha = sb.toString();
        }
        catch(NoSuchAlgorithmException ex){
         System.err.println("Erro de criptografia..." + ex);   
        }
        boolean autenticado = false;
        return false;
    }
}
