import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayı,limit,toplam=0 ,counter=1, bolum=0;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir tepe değer giriniz");
        limit=input.nextInt();

        while(counter<=limit){
            System.out.print(" Sayıyı Giriniz");
            sayı=input.nextInt();
            counter++;
            if (sayı%3==0 && sayı%4==0){
                bolum++;
                toplam=toplam+sayı;
            }
        }
        ortalama=toplam/bolum;
        System.out.print(" Ortalama= "+ortalama);

}}
