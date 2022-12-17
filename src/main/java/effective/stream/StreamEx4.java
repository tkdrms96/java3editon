package main.java.effective.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {
    //Stream<String[]> convert -> Stream<String>
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
                new String[] {"abc", "def", "jkl"},
                new String[] {"ABC", "GHI", "JKL"}
        );

        /*flatMap() 메서드는 먼저 매핑함수를 사용해 각 엘리먼트에 대해 map 수행 후, 결과를 새로운 배열로 평탄화*/

        Stream<String> strStream = strArrStream.flatMap(Arrays::stream);

        strStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try"
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        Stream<String> strStraem1 = Stream.of("AAA","ABC","bBb", "Dd");
        Stream<String> strStream2 = Stream.of("bbb","aaa","ccc", "dd");

        Stream<Stream<String>> strStreamStream = Stream.of(strStraem1, strStream2);

        Stream<String> stringStream = strStreamStream
                .map(s -> s.toArray(String[]::new))
                .flatMap(Arrays::stream);

        stringStream.map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);
    }
}
