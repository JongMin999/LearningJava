package exercise.chapter_36;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.atmosphereLimit);
        // Flyable.atmosphereLimit = 100; 불가능 final이 이미 적용

        Flyable bird = new Bird();
        Flyable airplane = new Airplane("AB112");

        bird.fly();
        airplane.fly();

        Walkable human = new Human();
        Human human2 = new Human();
        human2.setName("아이유");
        Walkable robot = new Robot("RB1233");

        human.walk();
        robot.walk();

        if(robot instanceof Robot){
            Robot robot2 = (Robot) robot;
            robot2.helpHuman(human2);
        }
    }
}
