package main.java.effective.stream;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEx1 {


    /* Optional 이란?
    * 자바에서 발생하는 NPE를 처리해주는 자바 8버전의 클래스 null이 올 수 있는 값을 감싸는 Wrapper 클래스이다.
    * Optional의 메서드와 사용법 등을 알아보자
    * */

    /*  Java8 이전 Null 처리
        List<String> names = getNames();
        List<String> tempNames = list != null
                ? list
                : new ArrayList<>();

        // Java8 이후
        List<String> nameList = Optional.ofNullable(getNames())
                .orElseGet(() -> new ArrayList<>());*/

    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("optStr=" +optStr.get());
        System.out.println("optInt=" +optInt.get());

        int result1 = Optional.of("123")
                        .filter(x->x.length() > 0)
                        .map(Integer::parseInt).get(); //result 123

        int result2 = Optional.of("123")
                        .filter(x->x.length() > 0)
                        .map(Integer::parseInt).orElse(-1); //result -1

        System.out.println(optInt.isPresent()); // isPresent == 값이 있으면 true 실행, 없으면 false 넘어가는 메서드 반환타입 void

        Optional<String> optOf = Optional.of("ㅋ"); // value값이 null이 아닌 경우에 사용한다
        Optional<String> opt = Optional.ofNullable("ㅋ"); // value값이 null이 아닌지 모를때 사용함
        Optional<String> opt2 = Optional.empty(); //빈객체 생성

        Optional<String> optStr2 = Optional.ofNullable(null);
        String resultStr = optStr2.orElse("orElse"); // null 일경우 orElse
                System.out.println(resultStr); //orElse
    }
}
