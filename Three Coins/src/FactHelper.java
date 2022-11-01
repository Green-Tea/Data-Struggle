public class FactHelper {
    public static long fact_helper(int n, int a) {
        if (n == 0) {
            return a;
        } else {
            return fact_helper(n-1, a * n);
        }
    }

    public static void main(String[] args) {
        System.out.println(fact_helper(5, 1));
    }
}

/*
Prove that fact_helper(n, a) returns a*n!
fact_helper(n, a) can be broken down into two parts;
fact(n)*a

Base case:
n = 0 -> 0! * a = a

Inductive hypothesis:
P(n) = "for any a, fact_helper(n, a) -> n!a"

Inductive step:
assume P(n-1) holds for n > 0
then fact_helper(n-1, a) -> (n-1)! * a
so n * (n-1)! = n!

 */
