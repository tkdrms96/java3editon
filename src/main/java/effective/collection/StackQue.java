package main.java.effective.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQue {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList(); // Queue 의 구현체가 LinkedList 임

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        while(!st.empty()){
            System.out.println(st.pop());
        }

        while(!st.empty()){
            System.out.println(q.poll());
        }

        /* 결과 q = 2 1 0 st = 0 1 2
        * st FIFO 먼저 넣은 값이 먼저 꺼내지는 구조
        * Q LIFO 나중에 넣은것이 먼저 꺼내지는 구저
        * 스택 활용 예시 수식계산, 수식괄호검사, 워드프로세서 undo, redo, 웹브라우저의 뒤로 앞으로
        * 큐 활용 예시 최근사용문서, 인쇄작업대기목록, 버퍼
        * */

    }
}
