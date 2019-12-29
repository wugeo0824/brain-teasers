class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || haystack.isEmpty() || needle == null || needle.isEmpty()) {
            return 0;
        }

        char first = needle.charAt(0);
        for (int i=0; i< haystack.length(); i++) {
            if (haystack.charAt(i) == first) {
                if (haystack.substring(i, i + needle.length() - 1).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}