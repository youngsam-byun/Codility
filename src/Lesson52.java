import org.junit.Test;

/**
 * Created by YS on 2016-12-30.
 */
public class Lesson52 {

    @Test
    public  void testSolution(){
        System.out.println(solution(6, 11, 2));
    }

    public int solution(int A, int B, int K) {

        int a_quote=A/K;
        int b_quote=B/K;

        boolean a_mod=A%K==0;
        boolean b_mod=B%K==0;


        //A=1,B=1
        if(A==B && !a_mod && !b_mod)
            return 0;

        //A=0,B=0 or A=2,B=2
        if(A==B && a_mod && b_mod)
            return 1;


        int diff=Math.abs(a_quote-b_quote);

        if(a_mod)
            diff++;

        return diff;
    }
}