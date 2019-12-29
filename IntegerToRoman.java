class Solution {
    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        int thousand = num / 1000;
        int hundred = (num % 1000) / 100;
        int ten = (num % 100) / 10;
        int one = num % 10;

        for (int t = 1; t <= thousand; t++) {
            stringBuilder.append('M');
        }

        buildForPosition(hundred, 'C', 'D', 'M', stringBuilder);
        buildForPosition(ten, 'X', 'L', 'C', stringBuilder);
        buildForPosition(one, 'I', 'V', 'X', stringBuilder);

        return stringBuilder.toString();
    }

    private void buildForPosition(int digit, char one, char five, char ten, StringBuilder stringBuilder) {
        switch (digit) {
        case 9:
            stringBuilder.append(one);
            stringBuilder.append(ten);
            break;
        case 8:
            stringBuilder.append(five);
            stringBuilder.append(one);
            stringBuilder.append(one);
            stringBuilder.append(one);
            break;
        case 7:
            stringBuilder.append(five);
            stringBuilder.append(one);
            stringBuilder.append(one);
            break;
        case 6:
            stringBuilder.append(five);
            stringBuilder.append(one);
            break;
        case 5:
            stringBuilder.append(five);
            break;
        case 4:
            stringBuilder.append(one);
            stringBuilder.append(five);
            break;
        case 3:
            stringBuilder.append(one);
            stringBuilder.append(one);
            stringBuilder.append(one);
            break;
        case 2:
            stringBuilder.append(one);
            stringBuilder.append(one);
            break;
        case 1:
            stringBuilder.append(one);
            break;
        }
    }

}