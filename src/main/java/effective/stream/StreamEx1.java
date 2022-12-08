package main.java.effective.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {

    /*  Stream.of("dd" ,"aaa","CC","cc","b");*/

    /*  result CCaaabccdd
    *   sorted() // 기본 정렬
    *   sorted(Comparator.naturalOrder()) // 기본 정렬
    *   sorted((s1, s2) -> s1.compareTo(s2))
    *   sorted(String::compareTo)
    * */

    /*   result ddccbaaaCC
     *   sorted(Comparator.reverseOrder()) // 기본 정렬
     *   sorted(Comparator.<String>naturalOrder().reversed()) // 기본 정렬 후 역순
     * */

    /*  result SaabCCcd
    *   sorted(String.CASE_INSENSITIVE_ORDER) // 대소문자 구분 X
    * */


    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("김1", 1, 300),
                new Student("김2", 3, 200),
                new Student("김3", 2, 160),
                new Student("김4", 4, 170),
                new Student("김5", 1, 180),
                new Student("김6", 2, 300)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder())) //기본정렬
                .forEach(System.out::println);

    }
}

class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;
    Student (String name, int ban, int totalScore){
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString(){
        return String.format("[%s, %d, %d]",name, ban, totalScore);
    }

    String getName() {return name;}
    int getBan() {return ban;}
    int getTotalScore() {return totalScore;}
    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
