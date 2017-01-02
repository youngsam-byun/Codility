import java.util.HashMap;
import java.util.Map;

/**
 * Created by YS on 2017-01-02.
 */
public class Lesson61 {
    public int solution(int[] A) {
        if(A==null)
            return 0;

        int len=A.length;
        if(len==1)
            return 1;

        Map<Integer,Integer> hmap = new HashMap<>();

        for(int i=0;i<len;i++)
            hmap.put(A[i],1);

        return hmap.size();

    }
}
