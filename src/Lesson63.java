import java.util.Arrays;

/**
 * Created by YS on 2017-01-02.
 */
public class Lesson63 {

    public int solution(int[] A) {

        if (A == null || A.length < 3)
            return 0;

        Arrays.sort(A);

        int N = A.length;

        for (int i = 2; i < N; i++) {
            long p = A[i - 2];
            long q = A[i - 1];
            long r = A[i];

            if (p + q > r && q + r > p && r + p > q)
                return 1;
        }


        return 0;
    }
}
