import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,agirlik,bedenkitleendeksi;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen metre olarak boyunuzu yaziniz");
        boy=input.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        agirlik=input.nextDouble();
        bedenkitleendeksi=agirlik/(boy*boy);
        System.out.println("Beden kitle endeksiniz= "+bedenkitleendeksi);


    }
}
