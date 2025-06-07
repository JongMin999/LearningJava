package exercise.chapter_15;

public class Literal {
    public static void main(String[] args) {
        //2진법
        int num = 0b1010;
        System.out.println(num);

        //8진법
        int num2 = 07010;
        System.out.println(num2);

        //16진법
        int num3 = 0xAC0;
        System.out.println(num3);

        //double
        double myDouble = 5.22E5; // 5.22 * 10^5
        System.out.println(myDouble);

        double myDouble2 = 2.55E-3; // 2.55 / 10^3
        System.out.println(myDouble2);

        //null
        String str = null;
        System.out.println(str);
    }
}
