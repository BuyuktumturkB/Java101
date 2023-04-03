import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi=3.14,r,area,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius");
        r=input.nextDouble();
        area=pi*r*r;
        c=2*pi*r;
        System.out.println(area+"cm^2 ");
        System.out.println(c+" cm");

    }
}
