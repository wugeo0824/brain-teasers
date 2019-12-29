class Solution {
    public String countAndSay(int n) {
        String book = "1";

        for (int i = 0; i < n; i++) {
            String bookCopy =  buildNewBook(book);
            book = bookCopy;
        }

        return book;
    }

    private String buildNewBook(String book) {
        StringBuilder result = new StringBuilder();

        int digitCount = 0;
        for (int i = 0; i < book.length(); i++) {
            int digit = book.charAt(i) - '0';
            if (i > 0 && book.charAt(i) != book.charAt(i - 1)) {
                result.append(digitCount);
                result.append(book.charAt(i - 1));
                digitCount = 1;
            } else {
                digitCount++;
            }

            if (i == book.length() - 1) {
                result.append(digitCount);
                result.append(digit);
            }
        }
        return result.toString();
    }

}