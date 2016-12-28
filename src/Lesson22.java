import java.util.HashMap;
import java.util.Map;

/**
 * Created by byun.ys on 2016-12-28.
 */
public class Lesson22 {

    public  int solution(int[] A){

        Map<Integer,Integer> hmap = new HashMap<>();

        for(int k:A){
            if(hmap.containsKey(k)){
               int v=hmap.get(k);
               hmap.put(k,v+1);
            }else
                hmap.put(k,1);
        }

        for(Map.Entry<Integer,Integer> et:hmap.entrySet()){
            int k=et.getKey();
            int v=et.getValue();

            if(v%2!=0)
                return  k;
        }

        return  -1;
    }

}
