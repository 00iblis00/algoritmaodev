/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
package week5;
/*
1 başla
2 kullanıcıdan sayı değeri al ve oku
3 for dönüsü ile girilen değere kadar arttır
4 for içindeki for a girilen değeri azalt sıfıra kadar
5 for döngüsündeki say değerlerinin kareslerinin toplamları sayi değeri ediyorsa ekrana yaz
6 bitir
*/
import java.util.Scanner;
/*
1başla
2 for döngüsünü 5 den başla bir bir azalt
3içine for döngüsü int değeri ilk for değerine eşitle bir bir azalt
4ekrana yaz
5bitir
*/
public class odev43{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        for (int i = 5; i > 0; i--) {
             for (int a = i; a>0; a--) {             
                     System.out.print("*");        
        }
             System.out.println();
        }
        
        
        
  
         
        
        // TODO code application logic here
    }
    
}
