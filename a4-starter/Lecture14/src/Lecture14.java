import java.util.Arrays;
import java.util.stream.Stream;

public class Lecture14 {
    public static int linearSearch(String[] array, String targetKey) {
        for (int i = 0; i < array.length; i++) {
            if (targetKey.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int binaryS(String[] array, String targetKey) {
        int i=0, r=array.length-1;
        while (i <= r) {
            // initially at mid index
            int index = i + (r - i) / 2;
            // if returns 0, it is equal; if returns -1, targetKey is less; if returns 1, targetKey is larger
            int compare = targetKey.compareTo(array[index]);
            if (compare == 0) return index;
            if (compare > 0) i = index + 1;
            else r = index - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] array = {"ab", "cc", "bex", "def"};
        System.out.println(binaryS(array, "cc"));
    }
}
