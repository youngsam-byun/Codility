import java.util.Arrays;

/**
 * Created by byun.ys on 2017-01-05.
 */
public class Lesson64 {



    public int solution(int[] A) {
       if(A==null)
           return -1;

       int N=A.length;
       if(N==1)
           return 0;

       final  int EXCEEED=10000000;

       int[] left=new int[N];
       int[] right=new int[N];

       for(int i=0;i<N;i++){
           left[i]=i-A[i];
           right[i]=i+A[i];
       }

       Arrays.sort(left);
       Arrays.sort(right);

       int j=0;
       int counter=0;
        for(int i=0;i<N;i++){
            while(j<N&&left[j]<=right[i]){
                counter+=counter+j-i;
                j++;
            }
            if(counter>EXCEEED)
                return -1;
        }

        return counter;
    }

}
