import java.util.ArrayList;

class Solution {
    public String getPermutation(int n, int k) {
        if (n <= 0)
            return "";

        int[] factorial = new int[n + 1];
        factorial[0] = 1;
        ArrayList<Integer> numbers = new ArrayList<Integer>(n);
        for (int i = 1; i <= n; i++) {
            factorial[i] = i * factorial[i - 1];
            numbers.add(i);
        }

        StringBuilder result = new StringBuilder();

        for (int i = n-1; i >= 0; i--) {
            int index = k / factorial[i];
            result.append(String.valueOf(numbers.get(index)));
            numbers.remove(index);
            k = k - factorial[i] * index;
        }

        return result.toString();
    }
}