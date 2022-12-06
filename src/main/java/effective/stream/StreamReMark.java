package main.java.effective.stream;

public class StreamReMark {

    /* 데이터를 배열, 컬렉션에 담을 때 for 문, Iterator 를 사용해 코드를 작성했다.
    *  코드가 길고 알아보기 힘들다. 재사용성도 떨어질 수 있다.
    *  Collection 이나 Iterator 인터페이스를 이용해 컬렉션을 다루는 방식을 표준화 했으나
    *  같은 이름 같은 기능의 메서드들이 중복해서 정의되어있다. ex) Collections.sort() , Arrays.sort()
    *  이러한 문제점을 위해 만든 것이 Stream
    * */


    /* 스트림은 데이터 소스를 변경하지 않는다.
    *  데이터 소스를 읽기만 하고 데이터 소스를 변경하지 않는다.
    * */

    /* 스트림은 일화용이다.
    *  Iterator처럼 일회용이다
    *  요소를 한번씩 읽고 나면 사용 할 수 없다.
    * */

    /* Stream의 정의된 연산
    * Stream<T> distinct() 중복 제거
    * Stream<T> filter(Predicate<T> predicate) 조건에 안맞는 요소 제거
    * Stream<T> limit(long maxSize) 스트림의 일부를 잘라낸다.
    * Stream<T> skip(long n) 스트림의 일부를 건너뛴다.
    * Stream<T> peek (Consumer<T> action) 스트림의 요소에 작업 수행
    * Stream<T> sorted(), sorted(Comparator<T> comparator) 스트림의 요소 정렬
    * Stream<R>, DoubleStream, IntStream, LongStream map 으로 리턴
    * void foreEach(Consumer<? super T> action) 각 요소에 원하는 작업 수행
    * void foreEachOrdered(Consumer<? super T> action) 각 요소에 원하는 작업 수행
    * long count() 스트림 요소의 개수 변환
    * max min 스트림의 최대값/ 최소값 반환
    *
    * */
}
