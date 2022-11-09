/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author oyunt

* 
* 
*
* 
 */

/*
1 başla
2 kullanıcıdan girdi al
3kontrol et 
4 kontrol sonrası çıktı ver
5 bitir
*/

import java.util.Scanner;
public class odev21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         float a=input.nextInt();
         if (a>0) {
            System.out.println("sayınız pozitif");
        }
         else if(a<0) {
            System.out.println("sayınız Negetif");
        }
         else {
            System.out.println("sayınız sıfır");
        }
        // TODO code application logic here
    }
    
}
