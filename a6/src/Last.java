public class Last {
    public static Integer binarySearchLast(int[] a, int k) {
        int left = 0;
        int right = a.length - 1;
        int foundIndex = -1;

        while (left <= right) {
            int mid = (left + right);
            int midVal = a[mid];

            if (midVal < k) {
                left = mid + 1;
            } else if (midVal > k) {
                right = mid - 1;
            } else {
                foundIndex = mid;
                left = mid + 1;
            }
        }
        if (foundIndex >= 0) return foundIndex;
        else return null;
    }
}
