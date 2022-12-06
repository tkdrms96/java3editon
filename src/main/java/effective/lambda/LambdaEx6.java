package main.java.effective.lambda;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class LambdaEx6 {
            /*[40, 39, 83, 65, 1, 53, 57, 71, 56, 92]
            [40,56,92,]
            [40, 39, 83, 65, 1, 53, 57, 71, 56, 92]*/

    /*      자바8에서 제공하는 주요 functional 인터페이스는 java.util.function 패키지에 다음과 같이 있다.
            람다식은 익명 객체 이기 때문에 람다식을 저장하기 위해선 함수형 인터페이스가 필요하다. 이때 필요한 functional interface
            Predicate
            Supplier
            Consumer
            Function
            UnaryOperator
            BinaryOperator*/


    public static void main(String[] args) {
        IntSupplier s = () -> (int)(Math.random() * 100) + 1;
        IntConsumer c = i -> System.out.print(i + ",");
        IntPredicate p = i -> i%2==0;
        IntUnaryOperator op = i -> i/10*10; //일의 자리 없앤다.

        int[] arr = new int[10];

        makeRandomList(s, arr);
        System.out.println(Arrays.toString(arr));
        printEvenNum(p, c, arr);
        int[] newArr = doSomething(op, arr);
        System.out.println(Arrays.toString(arr));
    }

    static void makeRandomList(IntSupplier s, int[] arr) {
        for (int i = 0; i<arr.length;i++){
            arr[i] = s.getAsInt();  //get 이 아니라 getAsInt()
        }
    }
    static void printEvenNum (IntPredicate p, IntConsumer c, int[] arr) {
        System.out.print("[");
        for (int i : arr ) {
            if (p.test(i)) {
                c.accept(i);
            }
        } //for
        System.out.print("]");
        System.out.println();
    } // end printEvenNum

    static int[] doSomething(IntUnaryOperator op, int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = op.applyAsInt(arr[i]);  //apply()아님에 주의
        }

        return newArr;
    }


}
