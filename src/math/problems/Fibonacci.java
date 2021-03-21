package math.problems;

public class Fibonacci {

    static void  printFibonacciNumbers(int n){
         int f1=0 ,f2=1,i;
         if (n<1)
             return;
        System.out.println(f1 +" ");
        for (i = 1; i < n; i++){
            System.out.println(f2+" ");
            int next=f1+f2;
            f1=f2;
            f2=next;

        }
    }


    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {
        printFibonacciNumbers(40);


    }


}
