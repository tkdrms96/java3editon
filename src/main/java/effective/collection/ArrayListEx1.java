package main.java.effective.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4)); //List subList(int fromIndex, int toIndex) fromIndex 부터 toIndex 까지 반환

        Collections.sort(list1); // void sort(Comparator c) c를 기준으로 ArrayList 정렬
        Collections.sort(list2); // void sort(Comparator c) c를 기준으로 ArrayList 정렬

        list2.add(3, "A");
        list2.add(3, "AA");

        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
        //boolean retainAll(Collection c) 주어진 컬렉션과 공통된 것을 제외한 나머지를 삭제 없을경우 false 반환

        for(int i = list2.size() -1; i >= 0; i--){
            if(list1.contains(list2.get(i))){ //boolean contains(Object o) 지정된 객체에 ArrayList가 포함 되어있는지 확인
                list2.remove(i);//boolean remove(Object o) 지정한 객체를 제거한다
            }
        }


    }
}
