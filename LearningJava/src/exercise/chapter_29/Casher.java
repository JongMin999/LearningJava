package exercise.chapter_29;

public class Casher {
    //속성 매상
    private long salesAmount;

    //행위
    //1. 커피가격 확인
    //2. 답변
    //3. 돈을 더한다
    //4. 주문을 알린다
    //5. 포장한다
    //6. 준비완료 알린다

    public long checkCoffeePrice(String coffeeName) {
        long price;
        switch (coffeeName) {
            case "아메리카노":
                price = 5000;
                break;
            case "카페라떼":
                price = 6000;
                break;
            case "카페모카" :
                price = 6500;
                break;
            case "카푸치노" :
                price = 6000;
                break;
                default:
                    price = 0;
                    break;
        }
        return price;
    }

    public void replyCoffeePrice(String coffeeName, long price){
        if(price ==0){
            System.out.println("캐셔: 죄송합니다. 손님. 말씀하신 메뉴: "+coffeeName + "는 저희가게에 없습니다.");
        }
        System.out.println("캐셔: 말씀하신 커피 " + coffeeName + "은 가격이" + price + "원입니다.");
    }

    public void addAmount(long money){
        this.salesAmount += money;
    }

    public void sayOrder(String coffeeName){
        System.out.printf("캐셔: %s 주문 들어왔습니다.\n", coffeeName);
    }

    public Coffee wrapUpCoffee(Coffee coffee){
        coffee.beWrappedUp();
        return coffee;
    }

    public void sayCoffeeMade(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.printf("캐셔: 주문하신 커피 %s 나왔습니다.\n", coffeeName);
    }

    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }
}
