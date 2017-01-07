import org.junit.Test;

import java.util.Stack;

/**
 * Created by YS on 2017-01-07.
 */
public class Lesson72 {

    @Test
    public void solutionTest() {
        int r = solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8});
        System.out.print(r);
    }

    public int solution(int[] H) {

        int len = H.length;
        if (len == 1)
            return 1;

        Stack<Integer> stack = new Stack<>();

        stack.push(H[0]);

        for (int i = 0; i < len - 1; i++) {
            int peek = stack.peek();
            int h1 = H[i];
            int h2 = H[i + 1];


            if (h1 == h2) {
                continue;
            } else if (h1 < h2) {
                stack.push(h2);

            } else if (h1 > h2) {

                boolean isExist=false;
                int size=stack.size();
                for(int j=size-1;j>=0;j--){
                    int k=stack.get(j);

                    if(k==h2){
                        isExist=true;
                        break;
                    }else if(k<h2)
                        break;
                }

                if(isExist)
                    continue;
                else
                    stack.push(h2);

            }

        }

        return stack.size();

    }

}
