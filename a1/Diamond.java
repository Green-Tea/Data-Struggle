public class Diamond {
    public static void printDiamond(int k) {
        for (int i = 1; i <= k; i++) {
            int pounds = Math.abs(i - k) + 1;
            int stars = (2 * k + 1) - pounds * 2;
            System.out.println("#".repeat(pounds) + "*".repeat(stars) + "#".repeat(pounds));
        }

        for (int n = 2; n <= k; n++) {
            int stars = (2 * k + 1) - n * 2;
            System.out.println("#".repeat(n) + "*".repeat(stars) + "#".repeat(n));
        }
    }
}