package exercise.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {
        Map<String,Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple",1);
        fruitMap.put("Banana",2);
        fruitMap.put("Orange",3);
        System.out.println(fruitMap);

        Integer appleCount = fruitMap.get("Apple");
        System.out.println(appleCount);

        Boolean isApple = fruitMap.containsKey("Apple");
        System.out.println(isApple);
    }
}
