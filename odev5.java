/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
  
1.Başla.
2.nesnenin kütlesini alın.
3.kürenin yüksekliğini alın.
4.nesnenin hızını alın.
4.nesnenin kinetik enerjini hesapla
5.nesnenin potansiyel enerjisini hesapla
6.kinetik ve potansiyel enerjisini ekrana yaz
7.Bitir.
*/
 
 import java.util.Scanner;
public class odev5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    System.out.println("İletkenin direncini giriniz");
    double o = input.nextDouble();
     System.out.println("iletkenin akımı");
     double a = input.nextDouble();
     double gerilim= o*a;
      System.out.println("iletkenin gerilimi: "+gerilim);
        // TODO code application logic here
    }
    
}
