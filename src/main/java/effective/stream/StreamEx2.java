package main.java.effective.stream;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx2 {

    /*  예제 File Stream에서 이름만 뽑아서 출력 하고싶을 때
     * */
    public static void main(String[] args) {

        File[] fileArr = {
                new File("Ex1.java"),
                new File("Ex1"),
                new File("Ex1.bak"),
                new File("Ex2.java"),
                new File("Ex1.txt")
        };
        Stream<File> fileStream = Stream.of(fileArr);

        //map () 으로 Stream<File>을 Stream<String>으로 변환시키기

        Stream<String> filenameStream = fileStream.map(file -> file.getName());
        filenameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1 ) //확장자가 없는것은 제외
                .map(s -> s.substring(s.indexOf('.')+1)) // 확장자만 추출
                .distinct()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
