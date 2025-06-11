package exercise.chapter_46;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();

        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Kiwi");

        System.out.println(fruitList); // List는 내부적으로 toString 구현으로 정상출력

        fruitList.add(3, "Lemon"); // 중간에 추가
        System.out.println(fruitList);

        fruitList.remove(3); // 삭제
        System.out.println(fruitList);

        String myFruit = fruitList.get(0); // 가져오기
        System.out.println(myFruit);

        fruitList.set(0, "Kiwi"); //바꾸기
        System.out.println(fruitList);

        System.out.println(fruitList.size()); // size크기

        List<String> fruitList2 = new ArrayList<>();
        System.out.println(fruitList2.isEmpty()); // 비었는지 true false
        System.out.println(fruitList.isEmpty());

        System.out.println(fruitList.contains(myFruit)); // 포함하는지
        System.out.println(fruitList.contains("딸기"));

        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2));
        String myFruit3 = "Apple";
        System.out.println(fruitList.indexOf(myFruit3));

        fruitList.clear();
        System.out.println(fruitList);
}}
