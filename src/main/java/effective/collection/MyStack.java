package main.java.effective.collection;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector { //Stack 의 구현제 Vector
    private int max;        // 스택 용량
    private int ptr;        // 스택 포인터
    private int[] stk;      // 스택 본체

    // 실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){};
    }

    // 실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){};
    }

    public MyStack(int capacity){
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e){       // 생성할 수 없음
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException{
        if( ptr >= max )
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyStackException {
        if( ptr <= 0)
            throw new EmptyStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyStackException{
        if ( ptr <= 0 )
            throw new EmptyStackException();
        return stk[ptr -1];
    }

    public int indexOf(int x){   // x 값에 해당하는 스택의 index 반환 없다면 -1
        for (int i = ptr -1; i >= 0 ; i--){
            if(x == stk[ptr])
                return i;
        }
        return -1;
    }

    public void clear(){        // 스택 비우기
        ptr = 0;
    }

    public int capacity(){      // 스택의 한계 용량치
        return max;
    }

    public int size(){          // 스택의 크기(데이터가 몇개 들어있는지)
        return ptr;
    }

    public boolean isFull(){    // 스택이 한계 용량치 인지 확인
        return ptr >= max;
    }

    public void dump(){         // 스택을 bottom 부터 top 까지 scan
        if( ptr <= 0 ){
            System.out.println("스택이 비어 있습니다.");
        }
        else {
            for(int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }

}
