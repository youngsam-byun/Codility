/**
 * Created by byun.ys on 2016-12-28.
 */
public class Lesson21 {

    public int[] solution(int[] A, int K) {

        if(A==null ||A.length==0 || A.length==1)
            return A;


        for(int i=0;i<K;i++)
            A=shift(A);

        return A;
    }

    private int[] shift(int[] A){
        int len=A.length;
        int[] tmp = new int[len];

        for(int i=0;i<len-1;i++)
           tmp[i+1]=A[i];


        tmp[0]=A[len-1];

        return tmp;
    }
}
