package exercise.chapter_27.packageTwo;

import exercise.chapter_27.packageOne.ClassA;

public class ClassB {

    public void testPublic(ClassA classA){
        String str = classA.publicStr;
        classA.methodPublic();
    }

}
