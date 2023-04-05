import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayı,  toplam=0;
        Scanner input = new Scanner(System.in);
       do {
           System.out.print(" Sayi: ");
           sayı=input.nextInt();
           if (sayı%2==0 && sayı%4==0)
           {
               toplam=toplam+sayı;

           }
        }while (sayı%2==0);
       System.out.print("Toplam: "+toplam);

}}
