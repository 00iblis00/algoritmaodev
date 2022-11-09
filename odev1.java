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
1.Başla.
2.kullanıcıdan kenar uzunluğunu alın.
3.kullanıcan kenar yüksekliğini alın.
4.üçgenin alanını hesaplayım değişkene ata.
5.üçgenin alanını ekrana yaz
6.Bitir.

*/


import java.util.Scanner;
public class odev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    System.out.println("kenar uzunluğunu girin");
    int kenar_uzunlugu = input.nextInt();
    System.out.println("kenar yüksekliğini girin");
    int kenar_yuksekligi=input.nextInt();
    double alan=(kenar_uzunlugu*kenar_yuksekligi)/2;
    System.out.println("Üçgenin alanı:"+alan);
    
        // TODO code application logic here
    }
    
}
