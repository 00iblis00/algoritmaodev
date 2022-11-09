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
1 başla
2 kullanıcıdan girdi al
3 girdinin modunu al
4 gelen değere göre koşul oluştur
5 koşula sonucuna göre çıktı ver
6 bitir
*/
import java.util.Scanner;
public class odev24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int a=input.nextInt();
         int b=a%2;
         if (b==1) {
             int toplam=0;
            while(a>=0){
                toplam=toplam+a;  
                a=a-2;
            }
            System.out.println(toplam);
        }
         else if(b==0) {
             a--;
             int toplam=0;
             while(a>=0){
                toplam=toplam+a;  
                a=a-2;
            }
            System.out.println(toplam);
        }
        
        // TODO code application logic here
    }
    
}
