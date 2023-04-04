import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int kenar1, kenar2, kenar3,  cevre;
        double alan;

        System.out.print("Lutfen 1. Kenarı giriniz");
        kenar1=input.nextInt();
        System.out.print("Lutfen 2. Kenarı giriniz");
        kenar2=input.nextInt();
        System.out.print("Lutfen 3 Kenarı giriniz");
        kenar3=input.nextInt();
        cevre=(kenar1+kenar2+kenar3);
        alan=(kenar1*kenar2)/2;
        
        System.out.println("Cevre : "+cevre);
        System.out.println("Alan: "+alan);






    }
}
