import org.junit.Test;


/**
 * Created by YS on 2016-12-31.
 */
public class Lesson53 {

    @Test
    public void solutionTest() {

        solution(new int[]{4, 2, 2, 5, 1, 5, 8});

    }


    public int solution(int[] A) {

        int N=A.length;

        if(N==2)
            return 0;

        double avr=(A[0]+A[1])/2.0;
        int idx=0;

        for (int i=2;i<N;i++){
            double tmp1= (A[i]+A[i-1])/2.0;
            double tmp2= (A[i]+A[i-1]+A[i-2])/3.0;

            if(avr>tmp1){
                avr=tmp1;
                idx=i-1;
            }

            if(avr>tmp2){
                avr=tmp2;
                idx=i-2;
            }
        }

        return  idx;

    }
}
