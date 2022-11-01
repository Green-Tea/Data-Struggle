public class RecursivePal<T> {
    public boolean isRecursivePalindrome(T[] a) {
        // Implement me
        if (a.length == 1) return true;
        else return isPalindrome(a, a.length/2);
    }

    public boolean isPalindrome(T[] a, int size) {
        for (int i = 0; i < size; i++) {
            // check if the first half is a palindrome
            // compare current with opposite side of the first half
            if (i < size/2) {
                if (!a[i].equals(a[size/2 - i - 1])) return false;
            // same idea as last one but don't have to restrict to half
            } else {
                if (!a[i].equals(a[size - i - 1])) return false;
            }
        }

        return true;
    }
}