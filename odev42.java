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
/*
1başla
2kullanıcıdan sayi al ve oku
3for döngüsü ile 0 dan başla 3 er arttır
4forun içine for ile 0 dan başla 5 er arttır
5 if ile 3 ve 5 in kaç katı olduğunu ekrana yaz
6 bitir
*/
public class odev42{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi=input.nextInt();
        for (int i = 0; i < sayi; i+=3) {
             for (int a = 0; a < sayi; a+=5) {
                 if (sayi==i+a) {
                     System.out.println("üçün: "+i/3+" katı"+"beşin: "+a/5+" katının toplamı"); 
                 }
        }
        }
        
        
        
  
         
        
        // TODO code application logic here
    }
    
}
