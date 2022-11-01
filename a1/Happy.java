public class Happy {

    public static long sumOfDigitsSquared(long n) {
        String nToString = Long.toString(n);
        long ans = 0;
        for (int i = 0; i < nToString.length(); i++) {
            char c = nToString.charAt(i);
            ans += (long) Integer.parseInt(String.valueOf(c)) * Integer.parseInt(String.valueOf(c));
        }
        return ans;
    }

    public static boolean isHappy(long n) {
        boolean flag = false;

        while (!flag) {
            n = sumOfDigitsSquared(n);
            if (n == 1 || n == 4) {
                flag = true;
            }
        }
        return n == 1;
    }

    public static long[] firstK(int k) {
        long[] ans = new long[k];
        int counter = 0;
        int n = 1;

        while (counter < k) {
            long i = sumOfDigitsSquared(n);
            if (isHappy(i)) {
                ans[counter] = n;
                counter++;
            }
            n++;
        }
        return ans;
    }
}
