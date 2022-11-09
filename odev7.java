/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oyunt
 */import java.util.Random;
 import java.util.Scanner;
public class odev7 {


        public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int oyuncu1can=200;
        int oyuncu2can=200;  
        for (int i = 0; i < 10; ) {
        Random r=new Random(); //random sınıfı
        int canverici=r.nextInt(100);
        Random k=new Random(); //random sınıfı
        int saldirigucu=k.nextInt(100);
        System.out.println("birinci oyuncu saldırmak için 1 can için 2 ye basın");
        double oyuncu1 = input.nextDouble();
        if (oyuncu1==1) {
        oyuncu2can=oyuncu2can-saldirigucu;
        System.out.println("ikinci oyuncu canı: "+oyuncu2can);
        if (oyuncu2can<=0) {
        System.out.println("birinci oyuncu kazandı");
        i=10;
        }           
        }
        else if(oyuncu1==2){
        canverici=oyuncu1can+canverici;
        System.out.println("birinci oyuncu canı: "+oyuncu1can);
        }
        else {
        System.out.println("Hatalı girş");
        i=10;
        }
        if( oyuncu2can>0 ){
        System.out.println("ikinci oyuncu saldırmak için 1 can için 2 ye basın");
        double oyuncu2 = input.nextDouble();
        if (oyuncu2==1) {
        oyuncu1can=oyuncu1can-saldirigucu;
        System.out.println("birinci oyuncu canı: "+oyuncu1can);
        if (oyuncu1can<=0) {
        System.out.println("ikinci oyuncu kazandı");
        i=10;
        }    
        }
        else if(oyuncu2==2){
        oyuncu2can=oyuncu2can+canverici;
        System.out.println("ikinci oyuncu canı: "+oyuncu2can);
        }
        else {
        System.out.println("Hatalı girş");
        i=10;
        }
        
        }
        }
        // TODO code application logic here
    }
    
}
