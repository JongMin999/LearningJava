package exercise.chapter_29;

public class Coffee {
    //속성
    //물 500ml 원두 30g
    // 테이크 아웃용
    private String coffeeName;
    private long waterQuantity; //ml
    private long coffeeBeanQuantity;
    private boolean isWrappedUp;
    private String wrapCondition;


    //행위
    void beWrappedUp(){
        this.isWrappedUp = true;
    }

    //생성자
    public Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity){
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false;
    }

    public String getCoffeeName() {
        return coffeeName;
    }
}
