package exercise.chapter_36;

public class Robot implements Walkable{
    //속성
    private String robotID;
    private String modelName;
    private String color;

    //행위
    @Override
    public void walk() {
        System.out.println("로봇ID("+ this.robotID + ")가 걷고 있습니다.");
    }
    public void helpHuman(Human human){
        String name = human.getName();
        System.out.println("로봇이 인간" + name + "을 돕습니다.");
    }

    public Robot(String robotID) {
        this.robotID = robotID;
    }
}
