public class DisariumNumber {
    int power(int N, int P)
    {
        int pow = 1;
        for (int i = 1; i <= P; i++)
            pow *= N;
        return pow;
    }

    boolean isDisarium(int n) {
        String s = String.valueOf(n);
        int digits = s.length();
        int ans = 0;
        for (int i = 1; i <= digits; i++) {
            char c = s.charAt(i-1);
            int a = Character.getNumericValue(c);
            ans += power(a, i);
        }
        return ans == n;
    }
}
