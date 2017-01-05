import java.util.Arrays;

/**
 * Created by byun.ys on 2017-01-05.
 */
public class Lesson64 {

    public int solution(int[] A) {
       if(A==null||A.length==0||A.length==1)
           return 0;

       int N=A.length;
       final  int EXCEEED=10000000;

       long[] left= new long[N];
       long[] right= new long[N];

       for(int i=0;i<N;i++){
           left[i]=(long) i-A[i];
           right[i]=(long) i+A[i];
       }

       Arrays.sort(left);
       Arrays.sort(right);

       int j=0;
       int counter=0;
        for(int i=0;i<N;i++){
            while(j<N&&left[j]<=right[i]){
                counter+=j-i;
                j++;
            }
            if(counter>EXCEEED)
                return -1;
        }

        return counter;
    }

}
