import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayı1, sayı2,sayı1fak=1, sayı2fak=1, sayı12fak=1, kombinasyon, k1,k2,k3;
        Scanner input = new Scanner(System.in);
        System.out.print(" 1. Sayıyı Giriniz");
        sayı1=input.nextInt();
        System.out.print(" 2. Sayıyı Giriniz");
        sayı2=input.nextInt();
        k3=sayı1-sayı2;
        k1=sayı1; k2=sayı2;
        while (k1>=1 && k2>=1 && k3>=1){
            sayı1fak=sayı1fak*k1;
            sayı2fak=sayı2fak*k2;
            sayı12fak=sayı12fak*k3;
            k1--;
            k2--;
            k3--;

        }
        kombinasyon= sayı1fak/(sayı2fak*sayı12fak);
        System.out.println("Kombinasyon = "+kombinasyon);



