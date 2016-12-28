import java.util.*;

/**
 * Created by YS on 2016-12-28.
 */
public class Lesson42 {

    public int solution(int[] A) {
        int N_MIN=1;
        int N_MAX=100000;
        int A_MIN=Integer.MIN_VALUE;
        int A_MAX=Integer.MAX_VALUE;

        int len=A.length;

        if(len==1 && A[0]<=0)
            return 1;
        else if(len==1 && A[0]==1)
            return 2;
        else if(len==1 && A[0]>=2)
            return A[0]-1;


        Arrays.sort(A);


        int a_min=A[0];
        int a_max=A[len-1];

        if(a_max<=0)
            return 1;

        if(a_min >=2)
            return 1;


        Map<Integer,Integer> hmap=new HashMap<>();

        for(int i:A)
            hmap.put(i,1);


        int curr=0;

        for(int i:A){
            if(i>0){
                curr=i;
                break;
            }
        }

        if(curr>=2)
            return 1;

        while(hmap.get(curr)!=null){
            curr++;
        }
        return curr;

    }

}
