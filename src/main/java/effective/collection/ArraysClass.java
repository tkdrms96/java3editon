package main.java.effective.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysClass {

    public static void main(String[] args) {
        int[] arr   = {0,1,2,3};
        int[] arr2  = Arrays.copyOf(arr, arr.length); // arr2 = [0,1,2,3]
        int[] arr3  = Arrays.copyOfRange(arr2,0,2); // arr3 = [0,1,2] copyOfRange (Array, int from int to)

        int[] arr4  = new int[5];
        Arrays.fill(arr4, 9); // arr4 = [9,9,9,9]

        int[] arrSort = {3,2,0,1,4};
        Arrays.sort(arrSort);// void sort(arrSort) 배열 정렬 arrSort [0,1,2,3,4]
        int[][] arrSort2 = {{11,12}, {13 ,14}};

        System.out.println(Arrays.toString(arrSort));
        System.out.println(Arrays.deepToString(arrSort2)); // 다차원배열 2차원 3차원 배열에서는 deepToString 함수 사용

        String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2)); //false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); //true 다차원 배열 및 2,3차원 배열에서는 deepEquals 사용

        List list = new ArrayList(Arrays.asList(arrSort));

        //list.add(12); // UnsupportedOperationException 예외 발생
    }
}
