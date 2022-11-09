/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
  
1.Başla.
2.kullanıcıdan dereceyi alın.
3.gelen değerlerle randyan hesapla.
4.gelen değerlerle gradyan hesapla.
5.gelen radyan ve gradyanı ekrana yazın.
6.Bitir.
*/

 import java.util.Scanner;
public class odev2 {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    System.out.println("derceyi giriniz");
    double dc = input.nextDouble();
    double radyan = (dc*Math.PI)/180;
    System.out.println(radyan+"Radyandır");
    double grandyan = (dc*200)/180;
    System.out.println(grandyan+"Radyandır");
        // TODO code application logic here
    }
    
}
