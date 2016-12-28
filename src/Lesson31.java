import java.util.Arrays;

/**
 * Created by byun.ys on 2016-12-28.
 */
public class Lesson31 {

    public int solution(int[] A) {

        if(A.length==0)
            return 1;

        if(A.length==1&&A[0]==1)
            return 2;
        else if(A.length==1&&A[0]>1)
            return 1;


        Arrays.sort(A);

        int len=A.length;

        int prev=0;
        int curr=0;

        boolean isStartWithOne=A[0]==1;

        for(int i=1;i<len;i++){
            prev =A[i-1];
            curr=A[i];

            if(curr-prev !=1)
                return prev+1;
        }

        if(isStartWithOne==false)
            return 1;
        else
            return curr+1;

    }
}
