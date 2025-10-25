package Array;

import java.util.Arrays;

public class Meeting {
    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        numberOfRooms(intervals);
    }

    private static void numberOfRooms(int[][] intervals) {
        int rooms = 1;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            if(prev[1] > current[0]){
                rooms++;
            }
            prev = current;
        }
        System.out.println(rooms);
    }
}
