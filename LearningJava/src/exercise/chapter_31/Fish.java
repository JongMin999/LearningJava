package exercise.chapter_31;

public class Fish {
    //속성
    private String sex; // "Male", "Female"
    protected boolean havingPoison; // true = 독, false = 무독
    private String startSpawningDate;
    private String endSpawningDate;
    String leavingSea;

    //행위
    void eat(String food){
        System.out.printf(myInfo() + "는 %s를 먹고 있습니다.\n", food);
    }
    void swim(int meter){
        System.out.printf("나는 %d미터를 헤엄칩니다.\n", meter);
    }
    void makeCrowd(exercise.chapter_25.Fish otherFish){
        System.out.printf("나는 다른 물고기와 무리짓습니다.");
    }
    void sleep(int sleepTime){
        System.out.printf("나는 %d시간 동안 잡니다\n", sleepTime);
    };

    String myInfo(){
        return String.format("물고기(sex=%s, havingPoison=%s, leavingSea=%s)", this.sex, this.havingPoison, this.leavingSea);
    }

    void printfmyInfo(){
        System.out.println(myInfo());
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        this.startSpawningDate = startSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }

    public boolean isHavingPoison() {
        return havingPoison;
    }
}