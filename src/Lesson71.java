import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by byun.ys on 2017-01-06.
 */
public class Lesson71 {

    @Test
    public void solutionTest() {
        solution(new String("([)()]"));
    }


    public int solution(String S) {
        if (S == null)
            return 0;

        if (S.length() == 0 || S.isEmpty())
            return 1;

        Map<Character, Integer> hmap = new HashMap<>();


        int N = S.length();

        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);

            if (hmap.get(c) == null)
                hmap.put(c, 1);
            else
                hmap.put(c, hmap.get(c) + 1);

        }

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<N;i++){
            char c=S.charAt(i);

            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else if(c==')'||c=='}'||c==']'){
                if(stack.isEmpty())
                    return 0;

                char d=stack.pop();
                if(
                        (c==')'&&d=='(')||
                                (c=='}'&&d=='{')||
                                (c==']'&&d=='[')
                        )
                    continue;
                else
                    return  0;
            }

        }

        if(stack.isEmpty()==false)
            return 0;

        return 1;
    }

}
