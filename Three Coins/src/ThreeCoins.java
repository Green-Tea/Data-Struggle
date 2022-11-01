import java.util.ArrayList;
import java.util.List;

public class ThreeCoins {

    public static List<Integer> change(int n) {
        switch(n) {
            case 20: return List.of(5, 5, 5, 5);
            case 21: return List.of(5, 5, 11);
            case 22: return List.of(11, 11);
            case 23: return List.of(11, 12);
            case 24: return List.of(12, 12);
            default:
                List<Integer> nMinus5 = new ArrayList<>(change(n-5));
                nMinus5.add(5);
                return nMinus5;
        }
    }
}

/*
Prove that with 5, 11 and 12, we can make any number greater than 20.

Base cases:
n = 20: (5, 5, 5, 5)
n = 21: (5, 5, 11)
n = 22: (11, 11)
n = 23: (11, 12)
n = 24: (12, 12)

Inductive hypothesis:
Assume that the statement holds true for P(k) where 20<=k<=n and n is an integer with n >= 25.

Inductive step:
We can assume that P(n-4) holds true because n-4 >= 20
To form a postage of n+1 cents, we only need to add 5 cents to the combination needed to make n-4 cents.
Thus showing that the inductive hypothesis holds true, then P(n+1) is also true, completing the inductive step.
 */