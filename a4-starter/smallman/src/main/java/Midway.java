public class Midway {

    public static void solve_hanoi(int n, int fromPeg, int toPeg, int auxPeg) {
        if (n == 1) {
            System.out.println("Move disk 1 from peg " + fromPeg + " to peg " + toPeg);
            return;
        }
        solve_hanoi(n-1, fromPeg, auxPeg, toPeg);
        System.out.println("Move disk " + n + " from peg " + fromPeg + " to peg " + toPeg);
        solve_hanoi(n-1, auxPeg, toPeg, fromPeg);
    }

    public static long totalSteps(int n) {
        if (n == 0) return 0;
        return 2 * totalSteps(n - 1) + 1;
    }

    public static long stepsRemaining(int[] diskPos) {
        return -1; // TODO: change me
    }

    public static void main(String[] args) {
        //solve_hanoi(3, 0, 1, 2);
        System.out.println(totalSteps(15));
    }
}

/*
Prove that for any n>=0, solve_hanoi(n, ...) generates exactly 2^n - 1 lines of instructions.
Define predicate P(n) := T(n) = 2^n - 1

Base case:
T(0) = 2^0 - 1 = 0

Inductive step:
Assume P(k) holds true. Let T(k) = 2^k - 1
We want to show that P(k+1) is true.

T(k+1) = 2^k+1 - 1
       = 2(T(k)) + 1
       = 2(2^k - 1) + 1
       = 2^k+1 - 1
Therefore T(k+1) = 2^k+1 - 1, so P(k+1) is true.

From mathematical induction we can conclude that T(n) = 2^n - 1 satisfies for all n >= 1.
 */
