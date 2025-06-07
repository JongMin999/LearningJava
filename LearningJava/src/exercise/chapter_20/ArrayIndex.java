package exercise.chapter_20;

import java.util.Arrays;

public class ArrayIndex {
    public static void main(String[] args) {
        //index get
        // {90, 87, 88, 75, 99, 65}

        int[] studentScores = { 90, 87, 88, 75, 99, 65};
        int score1 = studentScores[0];
        System.out.println(score1);

        studentScores[2] = 93;
        System.out.println(Arrays.toString(studentScores));

        for (int i = 0; i < studentScores.length; i++) {
            System.out.printf("이 Array의 %d 인덱스 값은 %d이다.\n", i,studentScores[i]);
        }

        for(int scores : studentScores){
            System.out.printf("student의 값은 %d 이다. \n", scores);
        }
    }
}
