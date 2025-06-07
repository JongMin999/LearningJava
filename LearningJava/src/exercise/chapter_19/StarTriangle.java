package exercise.chapter_19;

public class StarTriangle {
    public static void main(String[] args) {
        int row;
        int col;

        for(row = 1; row<=10; row++) {
            for(col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
