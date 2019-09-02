
package teste;

import java.util.Scanner;
/**
 *
 * @author Romildo A. Lima Jr.
 */
public class TesteCpf {
    
    public static void main (String args[]){
        
       Scanner tec = new Scanner(System.in);
       
        String cpf;
        int divideCpf[] = new int[11];
        int digito1=0;
        int digito2=0;
        int comparaDigito1;
        int comparaDigito2;
        
        System.out.println("Digite seu CPF.: ");
        cpf=tec.nextLine();
       
        for (int i = 0; i < cpf.length(); i++){
            divideCpf[i]=Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }
        for (int i = 0; i < 9; i++){
            digito1 += (divideCpf[i]*(10-i));
        }
        System.out.println(digito1);
            if ((digito1%11== 10)||(digito1%11==11)){
            digito1= 0;
            comparaDigito1 = digito1;
        System.out.println(comparaDigito1);
            }else{
        comparaDigito1 = 11-(digito1%11);
        System.out.println(comparaDigito1);
            }
        for (int i = 0; i < 10; i++){
            digito2 += (divideCpf[i]*(11-i));
        }
        if ((digito2%11==10)||(digito2%11==11)){
            digito2=0;
            comparaDigito2 = digito2;
        }else{
        System.out.println(digito2);
        comparaDigito2 = 11-(digito2%11);
        System.out.println(comparaDigito2);
        
        System.out.println(divideCpf[9] +" "+ divideCpf[10]);
        }
        if ((comparaDigito1 == divideCpf[9])&&(comparaDigito2 == divideCpf[10])){
            System.out.println("CPF Válido!");
        }else{
            System.out.println("CPF Inválido!");
        }
    }
}
    

