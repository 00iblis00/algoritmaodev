/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oyunt
 */
/*
1başla
2kullanıcan girdileri al
3kontrol sağla
4 kontrole göre çıktı ver
5 bitir
*/
import java.util.Scanner;
public class odev23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         float a=input.nextInt();
         float b=input.nextInt();        
         float c=input.nextInt();
         if (a==b && a==c && c==b) {
            System.out.println("eşkenar üçgen");
        }
         else if(a==b && a==c || b==a&&b==c || c==a&&c==b) {
            System.out.println("ikizkenar üçgen");
        }
         else {
            System.out.println("çeşit kenar üçgen");
        }
        // TODO code application logic here
    }
    
}