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
3 gelen girdiği kontrol et
4 kontrole göre çıktı ver
5 bitir


*/
import java.util.Scanner;
public class odev22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         float a=input.nextInt();
         if (a==1) {
            System.out.println("pazartesi");
        }
        else  if (a==2) {
            System.out.println("salı");
        }
         else  if (a==3) {
            System.out.println("çarşamba");
        }
          else  if (a==4) {
            System.out.println("perşembe");
        }
           else  if (a==5) {
            System.out.println("cuma");
        }
            else  if (a==6) {
            System.out.println("cumartesi");
        }
                else  if (a==7) {
            System.out.println("pazar");
        }
         else {
            System.out.println("geçersiz");
        }
        // TODO code application logic here
    }
    
}

