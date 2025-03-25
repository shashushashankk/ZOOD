package Login;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class AnagramProgramArray {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[][] arr1 = seperateAnagramArray(arr);
        for (String[] str : arr1) {
            for(String str2: str){
                if(str2!=null)System.out.print(str2+" ");
            }
            System.out.println();
        }
    }

    public static String[][] seperateAnagramArray(String[] array) {
        int arrayLength = array.length;
//        System.out.println("Array length is " + array.length);
        String[][] annogramArray = new String[arrayLength][arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int secIndex = 0;
            String val;
            try {
                val = array[i];
            } catch (NullPointerException e) {
                continue;
            }
            annogramArray[i][secIndex] = val;
            for (int j = i + 1; j < arrayLength; j++) {
//                System.out.println("i val is " + i);
                String secVal = array[j];

                if (isAnnagram(val, secVal)) {
                    secIndex++;
                    annogramArray[i][secIndex] = secVal;
                    array[j] = null;
                } else {
                    continue;
                }
            }
        }
        return annogramArray;
    }

    public static boolean isAnnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
        str1 = sortString(str1);
        str2 = sortString(str2);
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }

    public static String sortString(String str) {
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr)+" Converted into String");
        Arrays.sort(arr);
//        System.out.println("String is "+Arrays.deepToString(arr)+" and String 1st char is "+Arrays.toString(arr).charAt(2));
        return Arrays.toString(arr);
    }
}
