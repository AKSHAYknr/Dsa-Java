package Array;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }

    private static void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ans[j][n-1-i] = matrix[i][j];
            }
        }

        System.out.println(Arrays.deepToString(ans));
    }
}
