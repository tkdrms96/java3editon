package main.java.effective.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapRemoveEx1 {
    public static void main(String[] args) {
        HashMap<String, Integer> human = new HashMap<>();

        human.put("김상근", 100);
        human.put("최석규", 200);
        human.put("강민규", 300);

        //Integer removeResult = human.remove("김상근"); //HashMap의 key로 mapping해 remove
        boolean removeResult = human.entrySet().removeIf(
                entry -> entry.getKey().equals("김상근")); //entrySet 함수로 human객체를 entry

        //추가적으로 향상 for문을 사용해 map.keySet()과 Entry를 사용해 가지고오는것중 entry가 성능이 좋음

        /* 좋지 않은 방법 */
        /* for(String key : human.keySet()){
            System.out.println(key);
        }*/

        /* entry를 사용해 key를 가지고 오는 방법 성능면에서 더 좋다 */
        for(Map.Entry<String, Integer> entry : human.entrySet()){
            System.out.println(entry.getValue());
        }


    }
}
