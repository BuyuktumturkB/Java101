import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double first_price = 10, km, priceperkm = 2.20, finalprice;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter distence");
        km = input.nextInt();
        finalprice = (first_price + (km * priceperkm));
        if (finalprice <= 20) {
            finalprice = 20.0;
            System.out.println("Final Price= " + finalprice);


        }
        else
        {
            System.out.println(finalprice);

        }
    }
}
