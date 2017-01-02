import org.junit.Test;

/**
 * Created by YS on 2017-01-01.
 */
public class Lesson54 {

    @Test
    public  void solutionTest(){
        solution("A",new int[]{0},new int[]{0});
    }

    public int[] solution(String S, int[] P, int[] Q) {

        int M = P.length;

        final int A = 1, C = 2, G = 3, T = 4;


        int N = S.length();
        int[][] genoms=new int[4][N+1];


        for (int i = 0; i < N; i++) {
            int a=0,c=0,g=0,t=0;
            char s = S.charAt(i);
            if(s=='A')
                a=1;
            else if(s=='C')
                c=1;
            else if(s=='G')
                g=1;
            else
                t=1;

            genoms[0][i+1]=genoms[0][i]+a;
            genoms[1][i+1]=genoms[1][i]+c;
            genoms[2][i+1]=genoms[2][i]+g;
            genoms[3][i+1]=genoms[3][i]+t;

        }

        int[] ret = new int[M];


        for (int i = 0; i < M; i++) {
            int from = P[i];
            int to = Q[i];
            to++;

            if(genoms[0][to]-genoms[0][from]>0)
                ret[i]=A;
            else if(genoms[1][to]-genoms[1][from]>0)
                ret[i]=C;
            else if(genoms[2][to]-genoms[2][from]>0)
                ret[i]=G;
            else
                ret[i]=T;
        }


        return ret;

    }
}

