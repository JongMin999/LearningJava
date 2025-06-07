package exercise.chapter_29;

public class Customer {
    //속성
    //현금, 현재기분
    private long cashAmount;
    private String myFeeling;

    //행위
    //1. 가격물어본다. 2. 돈을 뺀다. 3. 아메리카노 테이크 아웃. 4. 커피마심. 5. 기분좋아짐

    public void askCoffee(Casher casher, String coffeeName){
        System.out.println("손님: " + coffeeName + "는 얼마인가요?");
    }

    public long withDrawCash(long amount){
        this.cashAmount -= amount;
        return amount;
    }

    public void orderCoffee(String coffeeName, boolean isWrappedUp){
        System.out.printf("손님: %s를 주문할게요\n", coffeeName);
    }

    public void drinkCoffee(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.printf("손님이 %s를 마십니다.\n",coffeeName);
    }

    public void upgradeFeeling(){
        this.myFeeling = "기분이 좋아짐\n";
    }

    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }
}
