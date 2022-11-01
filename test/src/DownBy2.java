public class DownBy2 {
    static int fooBar(int[] x) {
        while (x.length > 1) { // O(log n)
            int[] y = new int[x.length/2]; //O(n/2)
            for (int i=0;i<x.length/2;i++){ //O(n/2)
                y[i] = x[2*i]; // O(1)
                if (2*i+1 < x.length) //O(1)
                    y[i] = y[i] +x[2*i+1]; //O(1)
            }
            x = y; // O(1)
        }
        return x[0]; // O(1)
    }

    public static void main(String[] args) {
        System.out.println(fooBar(new int[]{1,2,3,4,5,6}));
    }
}
