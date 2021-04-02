/**
 * Created by user on 16/02/21.
 */
public class Ques1 {

    public void showRepeat (int arr[]){
        System.out.println("repeated elements are : ");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Ques1 q = new Ques1();

        int arr[]={1,1,2,3,4,5,5} ;
        q.showRepeat(arr);
    }
}
