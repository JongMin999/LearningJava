package exercise.chapter_25;

public class Fish {
    //속성
    String sex; // "Male", "Female"
    boolean havingPoison; // true = 독, false = 무독
    String startSpawningDate;
    String endSpawningDate;
    String livengSea;

    //행위
    void eat(String food){
        System.out.printf("나, 물고기는 %s를 먹고 있습니다.\n", food);
    }
    void swim(int meter){
        System.out.printf("나는 %d미터를 헤엄칩니다.\n", meter);
    }
    void makeCrowd(Fish otherFish){
        System.out.printf("나는 다른 물고기와 무리짓습니다.");
    }
    void sleep(int sleepTime){
        System.out.printf("나는 %d시간 동안 잡니다\n", sleepTime);
    };

    public static void main(String[] args) {

    }
}
