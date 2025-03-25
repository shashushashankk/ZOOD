package Login;


public class TestPgm {
    public static void main(String[] args) {
                int[] arr = {2, 3, 10, 6, 4, 8, 11, 1}; // Sample array
                int maxDiff = findMaxDifference(arr);
                System.out.println("Maximum difference is: " + maxDiff);
    }
    static int findMaxDifference(int[] arr){
        if(arr==null || arr.length<2){
            return -1;
        }
        int minVal=arr[0];
        int maxDiff=arr[1]-arr[0];
            System.out.println("min val "+minVal+" max val "+maxDiff);
        for(int val:arr){
            int newDif=(val-minVal);
            maxDiff=(maxDiff>newDif)?maxDiff:newDif;
            minVal=minVal<val?minVal:val;
            System.out.println("min val "+minVal+" max val "+maxDiff);
        }
        return maxDiff;
    }

}
