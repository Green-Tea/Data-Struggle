import java.math.BigInteger;

public class Fib {
    public static BigInteger fibonacci(int k) {
        BigInteger n1 = BigInteger.ZERO, n2 = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            BigInteger n3 = n1.add(n2);
            n1 = n2;
            n2 = n3;
        }
        return n1;
    }

    public static int firstNDigit(int n) {
        int i = 1;
        int digits = 1;
        while (digits < n) {
            BigInteger value = fibonacci(i);
            digits = value.toString().length();
            i++;
        }
        if (n == 1) {
            return n;
        } else {
            return i - 1;
        }
    }
}