import java.util.Arrays;

/**
 * Created by YS on 2016-12-28.
 */
public class Lesson41 {


    public int solution(int[] A) {
        final int N_MIN=1;
        final int N_MAX=100000;

        final int A_MIN=1;
        final int A_MAX=1000000000;

        int len=A.length;

        if(len==1){
            if(A[0]!=1)
                return 0;
            else
                return 1;
        }


        Arrays.sort(A);

        int prev;
        int curr;

        for(int i=1;i<len;i++){
            prev=A[i-1];
            curr=A[i];

            if(prev<A_MIN ||
                    prev>A_MAX ||
                    curr<A_MIN||
                    curr>A_MAX||
                    prev>len||
                    curr>len)
                return 0;

            if(curr-prev!=1)
                return 0;
        }

        return 1;


    }

}
