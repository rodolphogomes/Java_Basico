/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author Rodolpho Gomes
 */
public class Contador01 {

    public static void main(String[] args) {
        int cc = 0;
        while (cc<10) {
            cc++;
            if (cc==2 || cc == 4 || cc == 6) {
            continue;
        }
            if(cc == 7) {
                break;
            }
            System.out.println("Cambalhotas " + cc);
            
        }
    }
    
}
