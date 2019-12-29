import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> dictionary = new HashMap();

        for (String s: strs) {
            String key = getSignature(s);
            if (!dictionary.containsKey(key)) {
                dictionary.put(key, new ArrayList<String>());
            }
            dictionary.get(key).add(s);
        }

        return new ArrayList<>(dictionary.values());
    }

    private String getSignature(String input) {
        char[] ca = input.toCharArray();
        Arrays.sort(ca);
        return String.valueOf(ca);
    }
}