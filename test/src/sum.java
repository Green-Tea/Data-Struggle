public class sum {
    static int hSum(int[] x){
        while (x.length > 1) {
            int[] Y = new int[x.length/2];
            for(int i=0; i<x.length/2;i++){
                Y[i] = x[2*i] + x[2*i + 1];
            }
            x=Y;
        }
        return x[0];
    }

    public static void main(String[] args) {
        System.out.println(hSum(new int[]{1, 2, 3, 4, 5,6,7,8}));
    }
}
