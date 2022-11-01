import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LanCable {
    public static int getIndex(int[] arr, int val) {
        // thanks stack overflow
        return IntStream.range(0, arr.length).filter(i -> arr[i] == val).findFirst().orElse(-1);
    }

    public static long findMaxTotalLength(int n, int[] u, int[] v, int[] l) {
        // Implement me
        // Technically this fits the parameters given :)
        long ans = 0;
        Set<Integer> mst = new HashSet<>();
        // while l[i] <= 1000000
        while (Arrays.stream(l).min().getAsInt() <= 1000000) {
            int minVal = Arrays.stream(l).min().getAsInt();
            int i = getIndex(l, minVal);
            if (mst.contains(v[i]) && mst.contains(u[i])) ans += minVal;
            mst.add(u[i]);
            mst.add(v[i]);
            l[i] = 1000001;
        }
        return ans;
    }
}