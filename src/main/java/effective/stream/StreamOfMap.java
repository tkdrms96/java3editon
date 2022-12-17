package main.java.effective.stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamOfMap {
    public static void main(String[] args) {
        /*  예제 File Stream에서 이름만 뽑아서 출력 하고싶을 때
        * */

        Stream<File> fileStream = Stream.of(
                new File("Ex1.java"),
                new File("Ex1"),
                new File("Ex1.bak"),
                new File("Ex2.java"),
                new File("Ex1.txt")
        );
        Stream<String> filenameStream = fileStream.map(file -> file.getName());
        filenameStream.forEach(System.out::println);// 파일 이름출력

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1 ) //확장자가 없는것은 제외
                .peek(s -> System.out.printf("filename=%s%n", s)) //파일명 출력
                .map(s -> s.substring(s.indexOf('.')+1)) // 확장자만 추출
                .peek(s-> System.out.printf("extension=%s%n",s)) //확장자 출력
                .peek(s-> System.out.printf("extension=%s%n",s)) //확장자 출력
                .forEach(System.out::println);
    }



}
