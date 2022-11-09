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
5.nesnenin 
6.Bitir.
*/
 
 import java.util.Scanner;
public class odev4 {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    System.out.println("Nesnenin kütlesini girin");
    double m = input.nextDouble();
     System.out.println("Nesnenin yüksekliğini girin");
    double h = input.nextDouble();
      System.out.println("Nesnenin hızını girin");
    double v = input.nextDouble();
   double vkare=Math.pow(v,2);
      double ke=(m*vkare)/2;
      double ep=m*10*h;
      System.out.println("Nesnenin Kinetik enerjisi: "+ke);
      System.out.println("Nesnenin Potansiyel enerjisi: "+ep);
        // TODO code application logic here
    }
    
}
