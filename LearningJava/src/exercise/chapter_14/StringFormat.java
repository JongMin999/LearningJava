package exercise.chapter_14;

public class StringFormat {
    public static void main(String[] args) {
        // String 생성방식
        String str1 = "Happy";
        String str2 = String.valueOf(123);

        System.out.println(str1);
        System.out.println(str2);

        //String 1
        String result;

        result = String.format("문자 서식 : %s, %S", str1, str1);
        System.out.println(result);

        //Int
        int myInt = 10;

        result = String.format("정수 서식 : %d", myInt); // %d 대신 %05d 등으로 쓰면 5자리로 써달라.
        System.out.println(result);

        //float
        float myFloat = 12.545678f;

        result = String.format("실수 서식 : %f, %.1f, %.2f", myFloat, myFloat, myFloat);// %f 대신 %.1f, %.2f 등을 사용하면 첫번째, 두번째 소수점까지 표현
        System.out.println(result);
    }
}
