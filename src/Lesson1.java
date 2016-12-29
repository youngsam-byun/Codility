/**
 * Created by byun.ys on 2016-12-28.
 */
public class Lesson1 {

    public int solution(int N) {

        String s=Integer.toBinaryString(N);

        int max=0;
        int count=0;

        for(char c:s.toCharArray()){

            if(c=='1') {
                if(count>max)
                    max=count;

                count=0;
                continue;
            }
            else
                count++;

        }

        return max;

    }

}
