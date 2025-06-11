package exercise.chapter_50;

import exercise.chapter_33.Fish;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("메인메소드 실행"); // VM 옵션 -Xmx1m

        makecheckedException();
        System.out.println("메인메소드 실행2");
    }

    public static void makeUncheckException(){
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 10; // ArrayIndexOutofBoundsException

        System.out.println(intArr[index]);
    }

    public static void makecheckedException() throws FileNotFoundException {
        File file = new File("src/exercise/chapter_50/test.txt");
        FileInputStream fs = new FileInputStream(file);

        System.out.println("Fs 실행합니다.");
    }
}
