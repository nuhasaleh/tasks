import java.util.Arrays;

/**
 * Created by user on 16/02/21.
 */
public class Ques2 {
    public void fiveRepeat (int b[]){
        Arrays.sort(b);

        for (int i = 0; i <b.length-2 ; i++) {
            if (b[i] == b[i+1])
                System.out.print(b[i] + " ");
        }
    }

    public static void main(String[] args) {
        Ques2 q = new Ques2();
        int b[]={1,1,2,2,3,3,4,4,5,5,6,7,8} ;

        q.fiveRepeat(b);
    }
}


