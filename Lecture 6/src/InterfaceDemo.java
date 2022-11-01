import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceDemo {

    public static int mySum(List<Integer> numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>(List.of(3, 2, 5, 7));
        LinkedList<Integer> llist = new LinkedList<>(List.of(3, 2, 5, 7));

        System.out.println(mySum(llist));
        System.out.println(mySum(alist));
    }
}
