import org.junit.Test;

/**
 * Created by byun.ys on 2016-12-29.
 */
public class Lesson51 {

    @Test
    public void run(){
        solution(new int[]{0,1,0,1,1});
    }

    public int solution(int[] A) {
        int N_MIN = 1;
        int N_MAX = 100000;
        int PAIR_MAX = 1000000000;

        int len = A.length;
        int count = 0;
        int tmp = 0;

        int ones=0;
        for (int i = 0; i < len; i++){
            if(A[i]==1)
                ones++;
        }

        int minus=0;
        for (int i = 0; i < len; i++) {

            if (A[i] == 0) {
                tmp = ones-minus;
                        //counter(i, A);
                count += tmp;
            }else
                minus++;

            if(count>PAIR_MAX)
                return -1;
        }

        return count;
    }




    private int counter(int i, int[] a) {

        int c=0;
        for(int k=i+1;k<a.length;k++) {
            if (a[k] == 1)
                c++;
        }
        return c;
    }

}
