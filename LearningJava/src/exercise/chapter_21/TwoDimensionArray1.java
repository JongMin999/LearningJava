package exercise.chapter_21;

import java.util.Arrays;

public class TwoDimensionArray1 {
    public static void main(String[] args) {
        int[][] arr1 = new int[10][5];

        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 4; col++){
                System.out.printf("%d ", arr2[row][col]); // arr2[0][0], arr2[0][1] ...
            }
            System.out.println();
        }
    }
}
