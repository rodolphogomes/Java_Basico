
package validadorcpf;

import static java.lang.Math.toIntExact;
import java.util.Scanner;


public class ValidadorCpf {

  
    public static void main(String[] args) {
        
        int[] vcpf = new int[11];
         long cpf;
         long num=10000000000L;
         long resto;    
         int j;   
         int i;
         int dig1=0;
         int dig2=0; 
         
         Scanner read = new Scanner(System.in);
         cpf=read.nextLong();         
        
        //guarda cpf digitado em um vetor 
        for (j=0;j<11;j++){        
            resto = (cpf % num);
            i = toIntExact(cpf / num);
             num = num/10;
            cpf = resto;         
            vcpf[j] = i;     
        }   
        
        //soma primeiro digito
        i = 10;
        for (j=0;j<9;j++){            
          dig1=dig1+(vcpf[j]*i);
          i=i-1;            
        }
       
        //soma segundo digito
        i=11;        
        for (j=0;j<10;j++){            
            dig2=dig2+(vcpf[j]*i);           
            i=i-1;
        } 
       
        //calcula digito verificador 1 e 2
        dig1= dig1*10 %11; 
        dig2= dig2*10 %11;
        //caso resultado seja 10 mudar para 0
        if (dig1==10) dig1=0;
        if (dig2==10) dig2=0;
        //verifica se o digito verificador 1 e 2 obtidos são iguais aos digitos verificadores do cpf digitado
        if (dig1==vcpf[9] && (dig2==vcpf[10]))System.out.println("CPF Válido");
        else System.out.println("CPF inválido");
    }
    
}
