import basic.ArrayInJava;
import basic.Basic1;
import basic.SimpleClass;
import basic.TwoSumSimple;

import java.util.Arrays;

public class Main    {


public  static void RunBase1(){
//    Basic1 b1=new Basic1();
//    int sumOfIntIs=     b1.intSumOfTwoNumber(12,12);
//    System.out.println("B1 intSumOfTwoNumber result : "+ sumOfIntIs);
//    float sumOfFloatIs= b1.floatSumOfTwoNumber(12,12);
//    System.out.println("B1 floatSumOfTwoNumber result : "+ sumOfFloatIs);
//    int []arr={12,12,12,12};
//    int  intSumOfArrayElement= b1.sumOfArrayElement(arr);
//    System.out.println("B1 intSumOfArrayElement result : "+ intSumOfArrayElement);
//    int[][] arr2D ={{12,12},{12,12}};
//    int intSumOf2DArrayElement= b1.sumOf2DArrayElement(arr2D);
//    System.out.println("B1 intSumOf2DArrayElement result : "+ intSumOf2DArrayElement);
//    ArrayInJava arrayInJava=new ArrayInJava();
//    ArrayInJava arrayInJava=new ArrayInJava(new int[]{23,32,23});
//    ArrayInJava arrayInJava=new ArrayInJava(new int[][]{{23}, {32}, {23}});
//    ArrayInJava arrayInJava=new ArrayInJava(new int[]{23,32,23},new int[][]{{23}, {32}, {23}});

}

    public static void main(String[] args) {

        TwoSumSimple tsp=new TwoSumSimple();

        System.out.println(Arrays.toString(tsp.twoSum(new int[]{3, 2, 4}, 6)));
    }
}

