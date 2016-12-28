/**
 * Created by byun.ys on 2016-12-28.
 */
public class Lesson32 {

    public int solution(int X, int Y, int D) {

        int diff=Y-X;
        int quotient =diff/D;

        if(diff%D==0)
            return quotient;
        else
            return quotient+1;

    }

}
