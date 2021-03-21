package math.problems;

public class LowestNumber {

    static int getMin(int[] array, int n) {

        int res = array[0];
        for (int i = 1; i < n; i++) {
            res = Math.min(res, array[i]);

        }
        return res;
    }

    public static void main(String[] args) {
        /*
         Write a method to find the lowest number from this array.
         */

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        int n = array.length;
             System.out.println( "Minimum element"
                     + " of array: " + getMin(array, n));
    }

}

