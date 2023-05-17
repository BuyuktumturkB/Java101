 public static int counter;

    public static boolean isPalindrome;

    public static String PalindromeTwo(String str) {

        // code goes here
        String reverse= " ";

        for (int i=(str.length()-1); i>=0; i--){
            reverse=reverse+(str.charAt(i));
        }
        if (reverse==str)
        {
            isPalindrome=true;
            System.out.print("true");
        }
        else{
            isPalindrome=false;
            System.out.print("false");
        }

        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PalindromeTwo(s.nextLine()));

    }

}
