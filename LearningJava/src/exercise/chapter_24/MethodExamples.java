package exercise.chapter_24;

public class MethodExamples {
    public static void main(String[] args) {
        char ch = 'A';
        int decode = toUnicode(ch);
        System.out.println(decode);

        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1, myInt2);
        System.out.println(result);

        String res = sayHello();
        System.out.println(res);

        printHello("printHello");
        printHi();
    }
    static int toUnicode(char ch){
        return (int) ch;
    }
    static int sumAndMultiplyFour(int a, int b){
        return (a + b) * 4;
    }
    // 인자 값이 없을 수 있다, 출력 값은 있음.
    static String sayHello(){
        return "Hello";
    }
    // 인자 값이 있는데, 출력 값은 없다.
    static void printHello(String str){
        System.out.printf("함수 안에서 실행합니다. %s\n", str);
    }
    // 인자 값, 출력값 둘 다 없다.
    static void printHi(){
        System.out.println("Hi");
    }
}
