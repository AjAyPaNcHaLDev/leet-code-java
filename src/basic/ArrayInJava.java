package basic;

public class ArrayInJava {


    int  [] arr;
    int  [][] arr2D;
    public ArrayInJava(){
       this.arr= new int[]{10,12,15};
       this.arr2D=new int[][]{{10, 12, 15},{12,12,12}};
        System.out.println("Init with Default constructor");
    }
    public ArrayInJava(int []arr){
        this.arr=arr;
        System.out.println("Init with ArrayInJava(int []arr) constructor");

    }
    public ArrayInJava(int [][]arr2D){
        this.arr2D=arr2D;
        System.out.println("Init with ArrayInJava(int [][]arr2D) constructor");

    }
    public ArrayInJava(int []arr,int [][]arr2D){
        this.arr=arr;
        this.arr2D=arr2D;
        System.out.println("Init with ArrayInJava(int []arr,int [][]arr2D) constructor");

    }


}
