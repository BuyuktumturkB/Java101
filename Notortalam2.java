{
    public static void main(String[] args) {
        int math,phisic,chemia,language,history,music,control=0 ;
        double result;
        Scanner point = new Scanner(System.in);
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

        if (math>=0 && math<=100)
        {
          control++;
        }
        if (phisic>=0 && phisic<=100)
        {
          control++;
        }
        if (music>=0 && music<=100)
        {
          control++;
        }
        if (language>=0 && language<=100)
        {
          control++;
        }
        if (chemia>=0 && chemia<=100)
        {
          control++;
        }
        if (history>=0 && history<=100)
        {
          control++;
        }


        double sum=(math+phisic+chemia+language+history+music);
        result=sum/control;

        System.out.println("final average"+result);
        if (result>55)
          System.out.print("Well done you are successful ");
        else
          System.out.print("You are failure");

}}
