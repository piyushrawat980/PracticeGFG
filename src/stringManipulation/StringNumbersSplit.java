package stringManipulation;

import java.util.HashMap;
import java.util.Map;

public class StringNumbersSplit {
    public static void main(String[] args) {
        String test = "aaabbtttpppp";
        String compressed = compressString(test);
        System.out.println(compressed);
    }

    public static String compressString(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        StringBuilder compressedStr = new StringBuilder();
       
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            compressedStr.append(entry.getKey()).append(entry.getValue());
        }

        return compressedStr.toString();
    }
}
