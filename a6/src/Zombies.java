import java.util.Arrays;

public class Zombies {
    public static int countBad(int[] hs) {
        return mergeSort(hs);
    }

    public static int mergeSort(int[] a) {
        int n = a.length;
        if (n <= 1)
            return 0;
        int[] left = Arrays.copyOfRange(a, 0, n/2);
        int[] right = Arrays.copyOfRange(a, n/2, n);
        int c1 = mergeSort(left);
        int c2 = mergeSort(right);
        return mergeInto(left, right, a, c1+c2);
    }

    public static int mergeInto(int[] a, int[] b, int[] out, int c) {
        int i = 0, j = 0;
        for (int o = 0; i < out.length; o++) {
            if (o >= a.length) out[i] = b[j++];
            else if (j >= b.length) out[o] = a[i++];
            else if (a[i] > b[j]) out[o] = a[i++];
            else {
                out[o] = b[j++];
                c += a.length - i;
            }
        }
        return c;
    }
}
