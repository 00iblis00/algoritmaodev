/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
  
1.Başla.
2.kullanıcıdan kenar yarıçapını alın.
3.kürenin alanını hesapla.
4.kürenin alanını ekrana yazın
6.Bitir.
*/
 import java.util.Scanner;
public class odev3 {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("kürenin yarı çapını giriniz");
    double yc = input.nextDouble();
    double kurealanı = 4*3.14*yc*2;
    System.out.println("kürenin alanı"+kurealanı);
 
        // TODO code application logic here
    }
    
}
