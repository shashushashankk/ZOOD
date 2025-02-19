package Login;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class AnagramProgram {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        seperateAnagram(arr);
    }

    public static void seperateAnagram(String[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        LinkedHashMap<String, LinkedList> map = new LinkedHashMap<String, LinkedList>();
        for (String str : array) {
            String sortedStr = sortString(str);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new LinkedList());
            }
            map.get(sortedStr).add(str);
        }
        System.out.println(map.values());
    }

    public static String sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
