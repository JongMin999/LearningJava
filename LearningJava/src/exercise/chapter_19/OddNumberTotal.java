package exercise.chapter_19;

public class OddNumberTotal {
    public static void main(String[] args) {
        int total = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){// i가 짝수면 넘어간다.
                continue;
            }
            total += i;
        }
        System.out.printf("0에서 100까지 홀수를 더한 값은 %d", total);
    }
}
