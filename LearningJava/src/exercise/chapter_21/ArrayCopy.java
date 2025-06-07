package exercise.chapter_21;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }

        int[] arr2 = Arrays.copyOf(arr, arr.length); // Arrays.copyOf(복사할 배열, 배열의 크기);

        int[] arr3 = arr.clone(); // 복사할 배열.clone();

        arr[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
