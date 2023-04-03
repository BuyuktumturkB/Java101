import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int math,phisic,chemia,language,history,music;
        Scanner point=new Scanner(System.in);


        System.out.println("Please enter your mathematic point: ");
        math= point.nextInt();

        System.out.println("Please enter your phisic point: ");
        phisic= point.nextInt();

        System.out.println("Please enter your chemia point: ");
        chemia=point.nextInt();

        System.out.println("Please enter your language point: ");
        language=point.nextInt();

        System.out.println("Please enter your history point: ");
        history=point.nextInt();

        System.out.println("Please enter your music point");
        music=point.nextInt();

        double sum=(math+phisic+chemia+language+history+music);
        double result=sum/6;

        System.out.println("final average"+result);
        System.out.println(result>60?"You are succesfull":"You became failure");



        }
    }
}