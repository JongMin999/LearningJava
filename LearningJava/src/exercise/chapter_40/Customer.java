package exercise.chapter_40;

public class Customer {
    // 속성
    static int serialNums = 1;

    static{
        System.out.println("Customer 클래스가 로딩됩니다.");
    }

    //cd out/production/LearningJava
    //javap -v exercise.chapter_40.Customer -> 런타임 데이터 확인
    String hello1 = "Hello";
    String hello2 = "Hello2";

    protected String customerID;
    protected String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    // 행위
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    Customer(){}
    public Customer(String name){
        this.customerID = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    public void printMyInfo(){
        System.out.printf("Customer(customerId=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

}