import java.util.Arrays;

public class Pairs {
    static int pairs(int k, int[] arr) {
        Arrays.sort(arr);
        int counter = 0;
        for (int i:arr) {
            int number = i - k;
            if (binarySearch(arr, number)) counter++;
        }
        return counter;
    }

    static boolean binarySearch(int[] arr, int number) {
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == number) return true;
            else if (arr[mid] < number) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(pairs(1 , new int[]{1,5,3,4,2,2,4,6,8})); // 1,2,2,3,4,4,5,6,8
    }
}
