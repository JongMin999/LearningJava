package exercise.chapter_27.packageOne;

public class ClassAA {

    void testPublic(ClassA classA){
        String str = classA.publicStr;
        classA.methodPublic();
    }

    /*void testPrivate(ClassA classA){
        String str = classA.privateStr;
        classA.methodPrivate();
    } 안됨.
     */
}
