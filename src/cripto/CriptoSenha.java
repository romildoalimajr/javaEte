/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class CriptoSenha {
    
    public static String criptoSenha(String senha) throws UnsupportedEncodingException{
        
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] cripto = md.digest(senha.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            
            for (int b = 0; b < cripto.length; b++){
                String hex = Integer.toHexString(0xff & cripto[b]);
                if(hex.length()==1) hexString.append("0");
                hexString.append(hex);
            }
               return (hexString.toString());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CriptoSenha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
