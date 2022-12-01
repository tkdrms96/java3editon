package main.java.effective.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Business20221201 {
    public static void main(String[] args) {

        List<Map<String, Integer>> pointList = new ArrayList<>();

        Map<String, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < 300; i++){
            tempMap.put(String.valueOf(i), 1000 + i);
            pointList.add(tempMap);
        }
        /* 배치 개발 pointList 는 1(유저 마스터 포인트 컬럼) : n(로그컬럼) 예를 들어 만개의 데이터가 저장되어 있다
        * 쿼리를 호출해서 for 문을 돌려 Map<String, Integer> 키(아이디), 값(포인트)를 한 문장씩 로그를 update 쳐주고 Map 에 put 하는 방식에서는
        * 극단적 상황에서 update 해줄 데이터가 10만건의 데이터가 있을 경우 데이터 부하가 올 수 있다.
        * 또한 로그테이블에 update 쳐줄 동안 마스터 컬럼의 데이터를 타고 사용 로직이 넘어갈 경우 데이터가 꼬일 경우가 생길 수 있다.
        * 자바단에서 그루핑 하는 작업보단 데이터 성능 면에서 쿼리 update select 하는 방식으로 구현해보자
        * */

        /* 기존 코드*/



    }

}
