import java.util.*;

public class MinOps {
    private static int count;

    public int minimumOps(List<Integer> S, List<Integer> T) {
        count = 0;
        return counter(S,T);
    }

    public int counter(List<Integer> S, List<Integer> T) {
        // count number of times reverse or shift has to be called
        // base case
        if (S.equals(T)) return count;
        // recursion
        else if (reverse(S).equals(T)) {
            count++;
            return count;
        }
        else {
            count++;
            counter(shift(S), T);
            }
        return count;
    }

    public List<Integer> shift(List<Integer> s) {
        List<Integer> shifted = new ArrayList<>(s);
        Collections.rotate(shifted, s.size()-1);
        return shifted;
    }

    public List<Integer> reverse(List<Integer> s) {
        List<Integer> reversed = new ArrayList<>(s);
        Collections.reverse(reversed);
        return reversed;
    }
}
