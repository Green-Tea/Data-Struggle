import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllMeows {
    public static int[] allMeowLocations(String st) {
        st = st.toLowerCase();
        List<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < st.length() - 3; i++) {
            char first = st.charAt(i);
            char second = st.charAt(i+1);
            char third = st.charAt(i+2);
            char fourth = st.charAt(i+3);
            if (first == 'm' && second == 'e' && third == 'o' && fourth == 'w') {
                ans.add(i);
            }
        }
        Collections.sort(ans, Collections.reverseOrder());

        return ans.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(allMeowLocations("helloworld")));
        System.out.println(Arrays.toString(allMeowLocations("mMeoWmemeeMeowmmmmeowaawaaemow")));
        System.out.println(Arrays.toString(allMeowLocations("ztameOwMeowmeowMEOW")));
    }
}
