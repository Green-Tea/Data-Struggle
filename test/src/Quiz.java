public class Quiz {

//    void puzle2(int[] data) {
//        int n = data.length, p = data[0]; // T(1)
//        int i = 0, j = n-1; // T(1)
//        while (i <= j) {
//            while (i < n && data[i] < p) { i++; }
//            while (j >= 0 && data[j] > p) { j--; }
//            if (i<j) {
//                swap(data, i, j);
//                i++; j--;
//            }
//        }
//    }

    static int puzzle4(int b, int w, int a) {
        if (w==0) return a;
        if (w%2 == 0) {
            return puzzle4(b * b, w / 2, a);
        }
        else return puzzle4(b*b,w/2,a*b);
    }

    public static void main(String[] args) {
        System.out.println(puzzle4(5,4,3));
    }
}
