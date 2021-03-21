package math.problems;

public class FindLowestDifference {

    public static int[] FindLowestDifference(int[] a1,int[] a2){
        double lowestDiff=Double.MAX_VALUE;
        int[] lowestDiffPair=new int[2];

        for (int i=0;i<a1.length;i++){
            for (int j=0;j<a2.length;j++){
                int currentDiff = Math.abs(a1[i] - a2[j]);
                if(currentDiff<lowestDiff){
                    lowestDiff=currentDiff;
                    lowestDiffPair[0]=a1[i];
                    lowestDiffPair[1]=a2[j];
                }

            }
        }
        return lowestDiffPair;
    }

    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int[] pair=FindLowestDifference(array1,array2);
        System.out.println(pair[0]+" "+pair[1]);

    }

}
