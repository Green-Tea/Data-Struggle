public class MyCalculator {
    public static int divisor_sum(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                ans += i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(divisor_sum(6));
    }

}
