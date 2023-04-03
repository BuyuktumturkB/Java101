import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String password, options, new_password;

        System.out.print("Please enter your passport");
        password=input.next();

        if(password=="Araba")
            System.out.print("Wellcome");
        else
        {
            System.out.print("You wrote wrong password , would you like to change it?");
            options=input.next();
            if(options=="Yes") {   System.out.print("Please enter your new password");
                new_password=input.next();
                if(new_password==password)
                    System.out.print("Your new password can not be same with last one please try new one");
                else
                    System.out.print("New password recorded");
            }
            else
                System.out.print("Please enter your active password");

        }



    }
}
