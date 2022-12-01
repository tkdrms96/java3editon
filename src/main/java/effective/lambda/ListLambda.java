package main.java.effective.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListLambda {
    public static void main(String[] args) {

        //인터페이스 메서드 구현
        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "eee", "aaa");
        Collections.sort(list, new Comparator<String>(){
            public int compare (String s1, String s2){
                return s2.compareTo(s1);
            }
        });

        //람다식 표현시
        List<String> list2 = Arrays.asList("abc", "aaa", "bbb", "ddd", "eee", "aaa");
        Collections.sort(list2, (s1, s2) -> s2.compareTo(s1));

    }
}
