package exercise.chapter_24;

public class studentAverageScoreArray {
    public static void main(String[] args) {
        int[] scoresA = {20, 80, 44, 19, 87, 57, 79, 42, 95, 79, 51, 69};
        int[] scoresB = {89, 11, 11, 13, 55, 9, 17, 72, 51};

        System.out.println(averageScore(scoresA));
        System.out.println(averageScore(scoresB));

    }
    static double averageScore(int[] score){
        double sumScore = 0;
        for(int i = 0; i < score.length; i++){
            sumScore = sumScore + score[i];
        }
        return sumScore / score.length;
    }
}
