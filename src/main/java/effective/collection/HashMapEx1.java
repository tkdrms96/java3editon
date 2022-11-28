package main.java.effective.collection;

import java.sql.SQLOutput;
import java.util.*;

public class HashMapEx1 {

    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("김상근", new Integer(100));
        map.put("김상근2", new Integer(100));
        map.put("김상근3", new Integer(80));
        map.put("김상근4", new Integer(70));

        Set set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : " + e.getKey() + "점수 : " + e.getValue());
        }

        set = map.keySet();

        System.out.println("참가자 명단 :" + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()){
            Integer i = (Integer) it.next();
            total += i.intValue();
        }

        System.out.println("총점 : "+total);
        System.out.println("평균 : "+ (float)total/set.size());
        System.out.println("총점 : "+Collections.max(values));
        System.out.println("총점 : "+Collections.min(values));
    }
}
