class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        if (s.indexOf("IV") != -1) sum -= 2;
        if (s.indexOf("IX") != -1) sum -= 2;
        if (s.indexOf("XL") != -1) sum -= 20;
        if (s.indexOf("XC") != -1) sum -= 20;
        if (s.indexOf("CD") != -1) sum -= 200;
        if (s.indexOf("CM") != -1) sum -= 200;

        for (int i=0; i<s.length(); i++) {
            int digit = s.charAt(i);

            if (digit == 'I') sum += 1;
            if (digit == 'V') sum += 5;
            if (digit == 'X') sum += 10;
            if (digit == 'L') sum += 50;
            if (digit == 'C') sum += 100;
            if (digit == 'D') sum += 500;
            if (digit == 'M') sum += 1000;
        }

        return sum;
    }
}