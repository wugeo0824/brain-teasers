import java.util.Arrays;
import java.util.Comparator;

class Solution {
    private class IntervalComparator implements Comparator<int[]> {

        @Override
        public int compare(int[] o1, int[] o2) {
            if (o1[0] == o2[0]) return 0;
            return o1[0] < o2[0] ? -1:1;
        }

    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        
        Arrays.sort(intervals, new IntervalComparator());

        int[][] result = new int[intervals.length][intervals[0].length];
        int index = 0;
        result[index] = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (result[index][1] >= intervals[i][0]) {
                if (result[index][1] < intervals[i][1]) {
                    result[index][1] = intervals[i][1];
                }
            } else {
                index++;
                result[index]=intervals[i];
            }
        }

        result = Arrays.copyOfRange(result, 0, index);

        return result;
    }
}