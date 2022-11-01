import java.util.Arrays;

public class Subsel {
    public static int[] takeEvery(int[] a, int stride, int beginWith) {
        int counter = 0;
        boolean outOfBounds = false;

        // find out the size of the array that will be returned
        while (!outOfBounds) {
            counter++;
            if (beginWith + (counter * stride) + 1 > a.length || beginWith + (counter * stride) < 0) {
                outOfBounds = true;
            }
        }
        int[] ans = new int[counter];

        // fill in the new array
        for (int i = 0; beginWith + (i * stride) < a.length && beginWith + (i * stride) >= 0; i++) {
            ans[i] = a[beginWith + i * stride];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static int[] takeEvery(int[] a, int stride) {
        return takeEvery(a, stride, 0);
    }

}