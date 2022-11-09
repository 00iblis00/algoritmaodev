/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
1 başla
2 kullanıcıdan sayı değeri al ve oku
3 for dönüsü ile girilen değere kadar arttır
4 for içindeki for a girilen değeri azalt sıfıra kadar
5 for döngüsündeki say değerlerinin kareslerinin toplamları sayi değeri ediyorsa ekrana yaz
6 bitir
*/
import java.util.Scanner;
public class odev41{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi=input.nextInt();
        for (int i = 0; i < sayi; i++) {
             for (int a = sayi; a > 0; a--) {
                 if (sayi==(i*i)+(a*a)) {
                     System.out.println(sayi+" sayisinin değerininin "+a+ " sayısının karesi ile "+i+" sayısının karesinin toplamı"); 
                 }
        }
        }
        
        
        
  
         
        
        // TODO code application logic here
    }
    
}

