package exercise.chapter_47;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest{
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<String>();

        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Bread");

        System.out.println(fruitSet);
    }
}
