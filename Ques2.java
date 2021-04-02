/**
 * Created by user on 07/02/21.
 */
public class Ques2 {
    int a [] = {1,2,3} ;
    int b [] = new int [a.length] ;
    public void myClone (){
        for (int i = 0; i <a.length ; i++) {
            b[i] = a[i] ;
        }
    }
    public void print () {
        System.out.println("main array");
        System.out.print("[");
        for (int i = 0; i <a.length ; i++) {
            if (i== a.length-1)
                System.out.print(a[i]);
            else
                System.out.print(a[i]+",");

        }
        System.out.println("]");

        System.out.println("backup array");
        System.out.print("[");
        for (int i = 0; i <b.length ; i++) {
            if (i== b.length-1)
                System.out.print(b[i]);
            else
                System.out.print(b[i]+",");

        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Ques2 test = new Ques2() ;
        test.myClone();
        test.print();
    }
}
