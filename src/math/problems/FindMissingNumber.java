package math.problems;

import java.util.Scanner;

public class FindMissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr n value");
        int n = sc.nextInt();
        int[] inpuArray = new int[n];
        System.out.println("Enter (n-1) numbers: ");
        for (int i = 0; i <= n - 2; i++) {
            inpuArray[i] = sc.nextInt();
            {

            }
            int sumOfAll = (n * (n + 1)) / 2;
            int sumOfArray = 0;
            for (i = 0; i <= n - 2; i++) {
                sumOfArray = sumOfAll + inpuArray[i];
            }

            int missingNum = sumOfAll - sumOfArray;
            System.out.println("Missing num is: " + missingNum);

        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */


        }
    }
}