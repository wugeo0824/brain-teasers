class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int front = x;
        if (x == 0) return true;
        if (x % 10 == 0) return false;

        while (front > reversed) {
            int lastDigit = front % 10;
            reversed = reversed * 10 + lastDigit;
            front = front / 10;
        }

        if (reversed > front) {
            reversed = reversed / 10;
        }

        return reversed == front;
    }
}