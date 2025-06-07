package exercise.chapter_29;

public class Barista {
    //속성
    //행위 1. 커피 주문 확인 알린다.
    //2. 커피 만든다
    //3. 커피 완성을 알린다.

    public void noticeOreder(String coffeeName){
        System.out.printf("바리스타: %s커피 주문 확인했습니다.\n", coffeeName);
    }

    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity){
        Coffee coffee = new Coffee(coffeeName, waterQuantity, coffeeBeanQuantity);
        return coffee;
    }

    public void sayCoffeeMadeUp(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.printf("바리스타: %s 커피 완성되었습니다.\n", coffeeName);
    }
}
