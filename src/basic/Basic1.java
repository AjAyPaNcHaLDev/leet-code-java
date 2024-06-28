package basic;
public class Basic1 {
    public Basic1(){
        System.out.println("Init the basic1 constructor");
        }
    public int intSumOfTwoNumber(int a, int b){
        return a+b;
    }
    public float floatSumOfTwoNumber(float a, float b){
        return a+b;
    }
    public  int sumOfArrayElement(int [] arr){
            int sum=0;
            for (int j : arr) {
                sum += j;
            }
            return sum;
    }
    public  int sumOf2DArrayElement(int [][]arr){
        int sum=0;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }

        }
        return  sum;
    }
}
