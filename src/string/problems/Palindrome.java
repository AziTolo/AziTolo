package string.problems;


public class Palindrome {

    public static void main(String[] args) {

        String str = "XYBYBYX";

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */

    }

    private static boolean isPalindrome(String str) {
        return false;
    }


    static class Main
    {
        public static boolean isPalindrome(String str)
        {
            if (str == null || str.length() == 0) {
                return false;
            }

            for (int i = 0, j = str.length() - 1; i < j; i++, j--)
            {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
            }

            return true;
        }

        public static void main (String[] args)
        {

        }
    }

        }

