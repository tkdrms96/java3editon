package main.java.effective.collection;

import java.util.Vector;

public class ArrayListEx3 {

    public static void main(String[] args) {
        Vector v = new Vector(5);

        v.add("1");
        v.add("2");
        v.add("3");

        v.trimToSize(); //5개의 용량을 가진 Vector 를 생성 했으나 trimToSize 로 크기가 같아진다
        System.out.println(v);

        v.ensureCapacity(6); //최소 크기(capacity)를 6으로 늘림 기존의 인스턴스를 사용하는 것이 아니라 새로운 인스턴스 생성
        System.out.println(v);


        v.setSize(7);// size 7만큼 나머지 value를 null로 채움

        System.out.println(v);

        v.clear();

        System.out.println(v);

    }

}
