package exercise.chapter_20;

import java.util.Arrays;

public class ArrayDeclartion {
    public static void main(String[] args) {
        // int[]
        int[] intArr = new int[10];
        int[] intArr2 = new int[]{1, 2, 3, 4, 5};
        int[] intArr3 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(intArr2));
        System.out.println(Arrays.toString(intArr3));

        // float[]
        float[] floatArr = new float[10];
        float[] floatArr2 = new float[]{1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float[] floatArr3 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(floatArr2));
        System.out.println(Arrays.toString(floatArr3));

        // boolean
        boolean[] booleanArr = new boolean[10];
        boolean[] booleanArr2 = new boolean[]{true, true, true};
        boolean[] booleanArr3 = {true, true, true, true};

        System.out.println(Arrays.toString(booleanArr));
        System.out.println(Arrays.toString(booleanArr2));
        System.out.println(Arrays.toString(booleanArr3));
    }
}
