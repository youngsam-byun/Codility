/**
 * Created by byun.ys on 2016-12-28.
 */
public class Lesson33 {

    public int solution(int[] A) {

        if(A.length==2)
            return Math.abs(A[0]-A[1]);


        int min=Integer.MAX_VALUE;

        int len=A.length;

        int sum=0;
        for(int i:A)
            sum+=i;


        int ls=0;
        int rs=sum-ls;

        for(int i=0;i<len-1;i++){
            ls+=A[i];
            rs=sum-ls;

            int diff=Math.abs(ls-rs);

            if(diff<min)
                min=diff;
        }


        return min;
    }



}
