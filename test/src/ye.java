import java.util.Arrays;

public class ye {
    static void method1(int[] array) {
        int n = array.length; // O(1)
        for (int index=0;index<n-1;index++) { //O(n-1)
            int marker = helperMethod1(array, index, n - 1); //O(n)
            swap(array, marker, index); //O(3)
        }
    }
    static void swap(int[] array, int i, int j) { //O(3)
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    static int helperMethod1(int[] array, int first, int last) { // n+6
        int max = array[first]; // 1
        int indexOfMax = first; // 1
        for (int i=last;i>first;i--) { //n
            if (array[i] > max) { // 1
                max = array[i];  // 1
                indexOfMax = i; // 1
            }
        }
        return indexOfMax; // 1
    }

    static boolean method2(int[] array, int key) {
        int n = array.length; // 1
        for (int index=0;index<n;index++) { //n
            if (array[index] == key) return true;
        }
        return false;
    }

    static double method3(int[] array) {
        int n = array.length;
        double sum = 0;
        // lg(n) * 2n * 97
        // O(97*nlogn)
        for (int pass=100; pass >= 4; pass--) { // O(97)
            for (int index=0;index < 2*n;index++) { // O(2n)
                for (int count=4*n;count>0;count/=2) // O(lg(n))
                    sum += 1.0*array[index/2]/count;
            }
        }
        return sum;
    }

        static void programB(int n) {
        for (int c=1;c<n;c=c*3) {
            System.out.println(c);
        }
    }

    static int anotherSum(int[] xs) {
        if (xs.length == 1) return xs[0];
        else {
            int[] ys = Arrays.copyOfRange(xs, 1, xs.length);
            System.out.println(ys.length);
            return xs[0]+anotherSum(ys);
        }
    }

    int[] prefixSum(int[] xs) { // T(n)
        if (xs.length == 1) return xs; // 1
        else {
            int n = xs.length; // 1
            int[] left = Arrays.copyOfRange(xs, 0, n/2); // n+1
            left = prefixSum(left); // T(n/2)
            int[] right = Arrays.copyOfRange(xs, n/2, n); // n
            right = prefixSum(right); // T(n/2)
            int[] ps = new int[xs.length]; // 1
            int halfSum = left[left.length-1]; // 1
            for (int i=0;i<n/2;i++) { ps[i] = left[i]; } // n+1
            for (int i=n/2;i<n;i++) { ps[i] = right[i - n/2] + halfSum; } // n+1
            return ps; // 1
            // Add everything together
            // 1 + 1 + n+1 + T(n-1) + n + T(n-1) + 1 + 1 + n+1 + n+1 + 1
            // T(n) = 2T(n/2) + O(n)
        }
    }

    public static void main(String[] args) {
        anotherSum(new int[]{1, 2, 3, 4, 5});
    }
}