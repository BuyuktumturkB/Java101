import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int degree;
        System.out.print("Please enter hot degree");
        System.out.print(" Group 1 < 5 ");
        System.out.print(" Group 2 >= 5 and < 15 ");
        System.out.print(" Group 3 >=15 < 25 ");
        System.out.print(" Group 4 >=5 ");
        degree=input.nextInt();
        if (degree==1)
            System.out.print("We recommend you ski");
        else if (degree==2)
            System.out.print("We recommend you Cinema");
        else if (degree==3)
            System.out.print("We recommend you Picnic");
        else
            System.out.print("We recommend you Swimming");
}}
