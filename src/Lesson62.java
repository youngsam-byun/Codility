import java.util.Arrays;

/**
 * Created by YS on 2017-01-02.
 */
public class Lesson62 {

    public int solution(int[] A) {

        int len = A.length;
        if (len == 3)
            return A[0] * A[1] * A[2];

        Arrays.sort(A);


        int candidate = 0;

        if (A[0] >= 0 || A[len - 1] <= 0)
            candidate = A[len - 1] * A[len - 2] * A[len - 3];

        else {
            if (A[0] < 0 && A[1] < 0 && A[len - 1] > 0) {
                int candidate1=A[0] * A[1] * A[len - 1];
                int candidate2=A[len - 1] * A[len - 2] * A[len - 3];
                candidate =  candidate1>candidate2?candidate1:candidate2;
            }
            else if (A[0] < 0 && A[1] > 0 && A[len - 1] > 0)
                candidate = A[len - 1] * A[len - 2] * A[len - 3];
        }

        return candidate;
    }

}
