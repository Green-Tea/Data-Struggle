public class MyCalculator {
    public static long power(int n, int p) throws Exception {
        long ans = n;
        if (n < 0 && p < 0) {
            throw new Exception("n and p should not be negative.");
        }
        else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else {
            for (int i = 1; i < p; i++) {
                ans = ans * n;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(power(0, 0));
    }
}

