package main.java.effective.collection;

import java.sql.SQLOutput;
import java.util.*;

public class IteratorEx1 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasPrevious()){ // 역방향으로 읽어온다
            System.out.println("역순" + listIterator.previous());
        }

        //map 을 구현한 컬렉션 클래스는 키와 값을 쌍으로 저장해
        // iterator 직접 호출이 불가능하고 keySet 이나 entrySet 을 메서드를 통해 키와 값을 가지고와서 iterator()을 호출 해야 사용 가능
        Map map = new HashMap();

//        Iterator it = map.keySet().iterator();
        Iterator it = map.entrySet().iterator();

        Set eSet = map.entrySet();
        Iterator itValue = eSet.iterator();

        /*Iterator 의 메서드
        * boolean hashNext 읽어올 요소가 남아있는지 확인 있으면 true 없으면 false
        * Object next() 다음 요소를 읽어온다. next 를 호출 하기전에 hasNext 를 호출해 읽어올 값이 있는지 확인하는 것이 안전
        * void remove next()로 읽어온 요소들을 삭제
        * */
    }

}
