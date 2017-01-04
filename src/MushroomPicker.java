/**
 * Created by byun.ys on 2017-01-04.
 */
public class MushroomPicker {

    /*
    @Test
    public void testSolution() {

        assertThat(getMaxMushrooms(new int[]{2, 3, 7, 5, 1, 3, 9}, 4, 6)).isEqualByComparingTo(25);

    }
*/
    public int getMaxMushrooms(int[] mushrooms, int k, int m) {

        int n = mushrooms.length;
        int result = 0;
        int[] prefixSum = prefixSum(mushrooms);

        int loop = Math.min(k, m) + 1;

        for (int i = 0; i < loop; i++) {
            int l_pos = k - i;
            int r_pos = 0;

            if (k + m - 2 * i >= n - 1)
                r_pos = n - 1;
            else if (k + m - 2 * i <= k)
                r_pos = k;
            else
                r_pos = k + m - 2 * i;

            result = Math.max(result, countSum(l_pos, r_pos, prefixSum));
        }

        loop = Math.min(m + 1, n - k);

        for (int i = 0; i < loop; i++) {
            int r_pos = k + i;
            int l_pos = 0;
            if(k-(m-2*i)>0)
                l_pos=k-(m-2*i);
            else if(k-(m-2*i)==0)
                l_pos=0;
            else if(k-(m-2*i)>=k)
                l_pos=k;

            result = Math.max(result, countSum(l_pos, r_pos, prefixSum));
        }
        return result;
    }

    private int countSum(int s, int e, int[] prefixSum) {
        if (prefixSum == null || prefixSum.length == 0)
            return Integer.MIN_VALUE;

        int len = prefixSum.length;
        if (e > s && e + 1 <= len)
            return prefixSum[e + 1] - prefixSum[s];

        return Integer.MIN_VALUE;
    }

    private int[] prefixSum(int[] mushrooms) {
        int len = mushrooms.length;
        int[] sum = new int[len + 1];
        sum[0] = 0;

        for (int i = 1; i <= len; i++)
            sum[i] = sum[i - 1] + mushrooms[i - 1];

        return sum;
    }


}
