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
2 kullanacıdan girdileri al
3 döngü oluşturup işlemleri gerçekleştir
4 sonucun çıktısı ver
5 bitir
*/
import java.util.Scanner;
public class odev25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int a=input.nextInt();
         int b=input.nextInt();
         int toplam=0;
        while(b>0){
            b--;
            toplam=toplam+a;
        }
       System.out.println(toplam);
       
        // TODO code application logic here
    }
    
}
