import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yıl;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dilediğiniz yılı yazınız");
        yıl=input.nextInt();

        if (yıl%400==0)
            System.out.print("Bu bir artık yıldır.");
        else
            System.out.print(" Bu bir artık yıl değildir.");

}}
