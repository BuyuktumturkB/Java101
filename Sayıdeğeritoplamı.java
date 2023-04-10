import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi,toplam=0,bolen=10,bolum;
        Scanner input = new Scanner(System.in);
        System.out.print("Yeni Sayıyı Giriniz");
        sayi=input.nextInt();
         while (sayi>0)
         {
             bolum=sayi%bolen;
             sayi=sayi/10;
             toplam=toplam+bolum;
         }
         System.out.print(" Sayı değeri toplamı "+toplam);
        }
