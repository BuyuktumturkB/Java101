import java.util.*;
import java.io.*;

class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Say değeri giriniz");
        int number = input.nextInt();
        int m = 1;
        int n;
        do {
            n = 1;


            do {

                System.out.print(" ");

            }


            while (++n <= number - m + 1);
            n = 1;
            do {

                System.out.print("*");
            }
            while (++n <= m * 2 - 1);

            System.out.println();

        }

        while (++m <= number);
        m = number - 1;
        do {
            n = 1;

            do {
                System.out.print(" ");

            } while (++n <= number - m + 1);

            n = 1;

            do {

                System.out.print("*");

            } while (++n <= m * 2 - 1);


            System.out.println();

        }

        while (--m > 0);
    }
    }
