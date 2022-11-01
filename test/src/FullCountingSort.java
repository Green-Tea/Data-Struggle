import java.util.*;

public class FullCountingSort {
    static void countSort(List<List<String>> arr) {
        int n = arr.size();
        // Replace the first half of strings with -
        for (int i = 0; i < n/2; i++) {
            arr.get(i).set(1, "-");
        }
        // Sort numbers
        quickSort(arr);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n-1; i++) {
            ans.append(arr.get(i).get(1)).append(" ");
        }

        ans.append(arr.get(n-1).get(1));
        System.out.println(ans);
    }

    static void splitInto(List<List<String>> a, int pivot, List<List<String>> lt, List<List<String>> eq, List<List<String>> gt) {
        for (int i=0;i<a.size();i++) {
            List<String> current = a.get(i);
            if (Integer.parseInt(current.get(0)) < pivot) lt.add(current);
            else if (Integer.parseInt(current.get(0)) > pivot) gt.add(current);
            else eq.add(current);
        }
    }

    static void quickSort(List<List<String>> a) {
        if (a.size() <= 1) return;
        List<List<String>> lt = new ArrayList<>();
        List<List<String>> eq = new ArrayList<>();
        List<List<String>> gt = new ArrayList<>();

        int pivot = Integer.parseInt(a.get(a.size()/2).get(0));
        splitInto(a, pivot, lt, eq, gt);
        quickSort(lt);
        quickSort(gt);

        a.clear();
        a.addAll(lt);
        a.addAll(eq);
        a.addAll(gt);
    }

    public static void main(String[] args) {
        ArrayList<List<String>> arr = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("0");
        list1.add("A");
        arr.add(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("2");
        list2.add("B");
        arr.add(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("1");
        list3.add("C");
        arr.add(list3);

        List<String> list4 = new ArrayList<>();
        list4.add("1");
        list4.add("D");
        arr.add(list4);

        countSort(arr);
    }
}
