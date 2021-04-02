import java.util.Scanner;

/**
 * Created by user on 07/02/21.
 */
public class Ques1 {
    int arr1[] ={2, 3,4} ;
    int arr2 [] = new int [3] ;
    public void reverse () {
        int j = 0;
        for (int i = arr1.length; i >0 ; i--,j++) {
            arr2[j] = arr1[i-1] ;
        }
    }
    public void print () {
        System.out.println("before revers");
        System.out.print("[");
        for (int i = 0; i <arr1.length ; i++) {
            if (i== arr1.length-1)
                System.out.print(arr1[i]);
            else
                System.out.print(arr1[i]+",");

        }
        System.out.println("]");

        System.out.println("after revers");
        System.out.print("[");
        for (int i = 0; i <arr2.length ; i++) {
            if (i== arr2.length-1)
                System.out.print(arr2[i]);
            else
                System.out.print(arr2[i]+",");

        }
        System.out.println("]");
    }

    public static void main(String[] args) {
     Ques1 test = new Ques1();
        test.reverse();
        test.print();
    }
}
