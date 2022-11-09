/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.util.Scanner;
public class odevler31{

    /**
     * @param args the command line arguments
     */
    /*
    başla
    n değerini klavyeden oku/gir
    s=1;fak=1;
    s=s+1;
    adım 4 e git
    faktoriyel yazdır
    bitir
    */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); 
          System.out.print("lütfen ödev numarasını girin");
         int odevnumarasi=input.nextInt();
         //----------------------------------------------------------------------------------------------------------------
         /*
         1başla
         2kullanıcıdan metre uzunluğunu al
         3hangi türe dönüştüreceğni al ve oku
         4eğer 1 ise mm ye çevir
         5eğer 1 ise cm ye çevir
         6eğer 1 ise dm ye çevir
         7eğer 1 ise km ye çevir
         8bitir
         */
         if (odevnumarasi==1) {
             System.out.print("lütfen metre uzunluğunu girin :");
             int metreuzunluk=input.nextInt();
             System.out.print(" mm için : 1\n cm için : 2\n dm için : 3\n km için : 4\n");
             int donusme=input.nextInt();
             if (donusme==1) {
                 int mm=metreuzunluk*1000;
                 System.out.print("mm cimsinden :"+mm);
             }
            else if (donusme==2) {
                 int cm=metreuzunluk*100;
                 System.out.print("cm cinsinden :"+cm);
             }
            else if (donusme==3) {
                int dm=metreuzunluk*10;
                 System.out.print("dm cinsinden :"+dm);
             }
            else if (donusme==4) {
                int km=metreuzunluk/1000;
                 System.out.print("km cinsinden :"+km);
             }
             else  {
                System.out.print("yanlış giriş");
            }            
            }
         //--------------------------------------------------------------------------------------------------------------------------
         /*
         1başla
         2kullanıcıdan x değerini al
         3girilen değere işlemler uygula
         4eğer değer pozitif ise pozitif 
         5eğer değer negatif ise negatifdir
         6olmaz ise nötürdür
         7bitir
         */
         else if (odevnumarasi==2){
         System.out.print("lütfen x değerini girin :");
             int x=input.nextInt();
             int isaret=(x*x)-(5*x)-3;
             if (isaret>0) {
                 System.out.print("fonksiyon sonucu pozitif");
             }
              if (isaret<0) {
                 System.out.print("fonksiyon sonucu Negatif");
             }
               else  {
                 System.out.print("fonksiyon sonucu nötr");
             }   
         }
         //------------------------------------------------------------------------------------------------------------------------- 
         /*
         1başla
         2kullanıcıdan pay değerini al
         3kullanıcıdan payda değerini al
         3girilen değere işlemler uygula
         4eğer değer pozitif ise pozitif 
         5eğer değer negatif ise negatifdir
         6olmaz ise nötürdür
         7bitir
         */
         else if (odevnumarasi==4){
         System.out.print("pay :");
         int a=input.nextInt();
         System.out.print("payda :");
         int b=input.nextInt();
         System.out.print("lütfen pozitif tam sayıyı girin :");
         int n=input.nextInt();
         int  c=0;
                   for (int i = 1; i == n; i++) {
                       a=10*a;
                     c=a/b;
                       a=a%b;
                 
             }
                   System.out.println(c);
             }
         
         //-------------------------------------------------------------------------------------------------------------------------
          
         /*
         1başla
         2kullanıcıdan küme değerini al
         3kullanıcıdan kombinasyon değerini al
         3küme değerinin faktorielini al
         4kombinasyon değerinin faktoriyeli al
         5küme ile kombinason farkını faktoriyelini al
         6işlemleri bitip ekrana yaz
         7bitir
         */
         else if (odevnumarasi==5){
         System.out.print("kaç elemanlı küme");
         int e=input.nextInt();
         System.out.print("kaçlı kombinasyonlusu");
         int k=input.nextInt();
         int f=e-k;
         int y=e;
         int o=k;
         int p=f;
         e--;
         k--;
         f--;
         for (;  e> 0; e--) {
         y*=e;        
             }
         for (;k>0 ; k--) {
                      o*=k;
                 
             }
         for (; f>0; f--) {
         p*=f;     
             }
        System.out.println(y/(o*p));
             }
         
         //-------------------------------------------------------------------------------------------------------------------------
         else {System.out.println("geçersiz odev giriş no");}
         
      
         
         //-------------------------------------------------------------------------------------------------------------------------
         
        
       
       
        // TODO code application logic here
    }
    
}