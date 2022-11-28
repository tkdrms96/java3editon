package main.java.effective.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx5 {

    public static void main(String[] args) {
        HashSet<String> setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setKyo = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");

        Iterator it = setB.iterator();

        while (it.hasNext()){
            Object tmp = it.next();
            if(setA.contains(tmp))
                setKyo.add(tmp);
        }

        //toArray
        String arr[] = new String[setA.size()];

        int i = 0;


        for (String ele : setA){
            arr[i++] = ele;
        }

        for(String n : arr){
            System.out.println(n);
        }




    }
}
