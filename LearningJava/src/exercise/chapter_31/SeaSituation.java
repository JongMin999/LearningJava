package exercise.chapter_31;

public class SeaSituation {
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.setSex("Male");
        fish1.setLeavingSea("동해");
        fish1.setHavingPoison(false);

        FishChild fish2 = new FishChild();
        fish2.setSex("Female");
        fish2.setHavingPoison(true);
        fish2.setLeavingSea("서해");

        System.out.println("독성여부" + fish2.isHavingPoison());

        //@Overide
        fish1.eat("새우");
        fish2.eat("새우");

        /*
        fish1.printfmyInfo();
        fish2.printfmyInfo();

        fish2.digging();
        fish2.setEatable(true);*/

        System.out.println(fish2.isEatable());
    }
}
