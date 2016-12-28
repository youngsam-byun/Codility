import java.util.HashMap;
import java.util.Map;

public class Lesson44 {

    public static void main(String[] args) {

        solution(1,new int[]{2, 1, 1, 2, 1});
    }

    public static int[] solution(int N, int[] A) {
        int[] counter = new int[N];

        int max = 0;
        int len = A.length;


        Map<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < len; i++) {

            int X = A[i];

            if (X >= 1 && X <= N) {

                counter[X - 1]++;

                if (hmap.get(X - 1) == null) {
                    hmap.put(X - 1, 1);


                    if (1 > max)
                        max = 1;

                } else {
                    int v = hmap.get(X - 1);
                    hmap.put(X - 1, v + 1);
                    if (v + 1 > max)
                        max = v + 1;
                }

            } else if (X == N + 1) {

                for (int k = 0; k < N; k++)
                    counter[k] = max;

            }

        }

        return counter;
    }
}