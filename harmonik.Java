import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayı;
        double harmonikseri, toplam=0, bolum;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz");
        sayı= input.nextInt();
        do
        {
            bolum=1/sayı;
           toplam=toplam+(bolum);
           
           sayı--;

        }while (sayı!=1);
        harmonikseri=1+toplam;
        System.out.print(" Harmonik değer = "+harmonikseri);



