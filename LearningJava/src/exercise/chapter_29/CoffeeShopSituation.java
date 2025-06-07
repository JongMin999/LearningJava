package exercise.chapter_29;

public class CoffeeShopSituation {
    public static void main(String[] args) {
        //손님 현금 : 5만원, 매상 : 100만원
        //인스턴스화
        Customer customer = new Customer();
        customer.setCashAmount(50_000);

        Casher casher = new Casher();
        casher.setSalesAmount(1_000_000);

        Barista barista = new Barista();

        //로직시작
        String coffeeName = "카푸치노";
        boolean isTakeOut = true;

        customer.askCoffee(casher,coffeeName);

        long price = casher.checkCoffeePrice(coffeeName);
        casher.replyCoffeePrice(coffeeName, price);

        long cash = customer.withDrawCash(price);
        customer.orderCoffee(coffeeName,isTakeOut);

        casher.addAmount(cash);
        casher.sayOrder(coffeeName);

        barista.noticeOreder(coffeeName);
        Coffee coffee = barista.makeUpCoffee(coffeeName, 500, 30);

        barista.sayCoffeeMadeUp(coffee);

        Coffee coffeeCompleted = casher.wrapUpCoffee(coffee);
        casher.sayCoffeeMade(coffeeCompleted);

        customer.drinkCoffee(coffeeCompleted);
        customer.upgradeFeeling();
    }
}
