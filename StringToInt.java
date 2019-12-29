class Solution {
    public int myAtoi(String str) {

        if (str.isEmpty())
            return 0;

        int i = 0;
        int sign = 1;

        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        if (i >= str.length()) return 0;

        if (str.charAt(i) == '+') {
            sign = sign * 1;
            i++;
        } else if (str.charAt(i) == '-') {
            sign = sign * -1;
            i++;
        }

        int base = 0;

        while (i < str.length() && (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
            int current = str.charAt(i) - '0';

            if (base > Integer.MAX_VALUE / 10 || base == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < current) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            base = base * 10 + current;
            i++;
        }

        return base * sign;
    }
}