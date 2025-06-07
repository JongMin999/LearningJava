package exercise.chapter_14;

public class Encoding {
    public static void main(String[] args) {
        // 'Z' -> int
        char ch1 = 'Z';
        System.out.println(ch1);
        System.out.println((int)ch1);

        // Int -> char
        int num = 66;
        System.out.println(num);
        System.out.println((char)num);

        //대소 비교
        char smallA = 'a';
        char largeA = 'A';

        boolean result = smallA > largeA;
        System.out.println(result);

        //특수 "\t", "\n", "\'"
        // " \ "는 이스케이프. 특수문자 사용가능
        char special1 = '\t';
        System.out.println(special1);

        char special2 = '\n';
        System.out.println(special2);

        char special3 = '\'';
        System.out.println(special3);

    }
}
