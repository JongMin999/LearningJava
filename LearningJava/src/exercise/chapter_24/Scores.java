package exercise.chapter_24;

public class Scores {
    public static void main(String[] args) {
        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        int sumAClass = studentAClass1 + studentAClass2 + studentAClass3;
        double averageAClass = sumAClass / (double) 3; // double로 명시적 표현

        int sumBClass = studentBClass1 + studentBClass2 + studentBClass3;
        double averageBClass = sumBClass / 3d;

        System.out.println(averageAClass);
        System.out.println(averageBClass);

        System.out.printf("%.2f\n", averageAClass);
        System.out.printf("%.2f", averageBClass);

        System.out.printf("%.2f\n", calculateAverage(studentAClass1, studentAClass2, studentAClass3));
    }
    static double calculateAverage(int studentScore1, int studentScore2, int studentScore3){
        int sumB1Class = studentScore1 + studentScore2 + studentScore3;
        return sumB1Class / (double) 3;
    }
}
