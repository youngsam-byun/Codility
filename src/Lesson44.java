import java.util.HashMap;
import java.util.Map;

public class Lesson44 {

    public  int[] solution(int N, int[] A) {

        int max = 0;
        int len = A.length;
        int base=0;

        Map<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < len; i++) {

            int X = A[i];

            if (X >= 1 && X <= N) {

                if (hmap.get(X - 1) == null) {
                    hmap.put(X - 1, 1);

                    if (1+base > max)
                        max = base+1;

                } else {

                    int v = hmap.get(X - 1);
                    hmap.put(X - 1, v + 1);

                    if (v + 1 +base> max)
                        max = v + 1+base;
                }

            } else if (X == N + 1) {
                base=max;
                hmap.clear();
            }
        }

        int[] r = new int[N];
        int c = 0;
        for (int k =0;k<N;k++) {
            int v=0;
            if(hmap.containsKey(k))
                v=hmap.get(k);

            r[c++] = v+base;
        }

        return r;

    }
}