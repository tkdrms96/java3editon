package main.java.effective.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayTypeConversion {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4));

        Integer[] array = new Integer[set.size()];

        int k = 0;

        for(Integer i : set){
            array[k++] = i;
        }

        //Object 에 HashSet 객체를 담는 방식
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Object[] array2 = set2.toArray();
        System.out.println(Arrays.toString(array2));


        //자바8 Streams 메서드 참조
        Set<Integer> set3 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Integer[] array3 = set3.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(array3));

        //stream 람다식 사용
        Set<Integer> set4 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Integer[] array4 = set4.stream().toArray(n -> new Integer[n]);

    }
}
