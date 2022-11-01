public class AllCaps {
    public static int[] allCapLocations(String st) {
        int[] ans = new int[st.length()];
        int size = 0;
        for (int i = 0; i < st.length(); i++) {
            int c = st.charAt(i);
            if (c >= 65 && c <= 90) {
                ans[size] = i;
                size++;
            }
        }

        int[] newAns = new int[size];
        int k = 0;
        while (ans[k] != 0) {
            newAns[k] = ans[k];
            k++;
        }
        return newAns;
    }
}
