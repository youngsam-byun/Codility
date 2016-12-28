import java.util.Arrays;

/**
 * Created by YS on 2016-12-28.
 */
public class Lesson43 {

    public static void main(String[] args){
       System.out.print(solution(5,new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

    public static int solution(int X, int[] A) {

        int range_min = 1;
        int range_max = 100000;

        int len = A.length;

        if(X<range_min||
                X>range_max)
            return -1;

        if (len == 1) {
            if (A[0] > X||
                    A[0]<1)
                return -1;

            if(A[0]!=X)
                return -1;

            if(A[0]==X)
                return 0;
        }

       boolean[] tmp=new boolean[X+1];
        int size=0;


       for(int i=0;i<len;i++){

           if(tmp[A[i]]==false) {
               tmp[A[i]] = true;
               size++;
           }

           if(size==X)
               return i;

       }


        return -1;

    }

    private static  boolean isSafe(boolean[] tmp, int X) {

        for(int i=1;i<tmp.length;i++) {
            if (tmp[i] == false)
                return false;
        }

        return true;

    }

}
