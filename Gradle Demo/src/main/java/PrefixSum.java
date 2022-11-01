public class PrefixSum {

    // returns x + y
    static int  sumInts(int x, int y) {
        return x + y;
    }

    // return an array of the prefix of input array
    static int[] prefixSum(int[] numbers) {
        int[] answer = new int[numbers.length];
        int temp = 0;
        for (int i=0;i<numbers.length;i++) {
            answer[i] = temp + numbers[i];
            temp += numbers[i];
        }

        return answer;
    }
}
