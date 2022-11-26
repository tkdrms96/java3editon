package main.java.effective.collection;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListLinkedListTest {

    /*ArrayList 와 LinkedList 의 속도 차이*/

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList(2000000);
        LinkedList l1 = new LinkedList();

        System.out.println("-------순차적으로 값 삽입하기-------");
        System.out.println("ArrayList :" + add1(a1));
        System.out.println("LinkedList :" + add1(l1));
        System.out.println("-------중간에 값 삽입하기-------");
        System.out.println("ArrayList :" + add2(a1));
        System.out.println("LinkedList :" + add2(l1));

        /* result
        -------순차적으로 값 삽입하기-------
        ArrayList :143
        LinkedList :256
        -------중간에 값 삽입하기-------
        ArrayList :1218095
        LinkedList :766

        */

        /* 결론
        * 순차적으로 추가/삭제 시  ArrayList 가 LinkedList 보다 빠르다
        * 단, 중간 데이터를 삽입할 때는 LinkedList 가 ArrayList 보다 빠르다
        * 상황에 따라 적합한 것을 선택해서 사용하는게 좋다
        * */
    }
    public static long add1(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) list.add(i+"");
        long end = System.currentTimeMillis();

        return end - start;
    }
    public static long add2(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) list.add(500, "X");
        long end = System.currentTimeMillis();

        return end - start;
    }
}
