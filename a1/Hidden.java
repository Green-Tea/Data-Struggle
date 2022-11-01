public class Hidden {
    public static boolean isHidden(String s, String t) {
        StringBuilder tCheck = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int counter = 0;

        // extract all the characters of t that exist in s
        for (int i = 0; i < s.length(); i++) {
            for (int n = 0; n < t.length(); n++) {
                if (t.charAt(n) == s.charAt(i)) {
                    tCheck.append(s.charAt(i));
                }
            }
        }

        // if tCheck has less characters than t, return false. if tCheck == t, return true
        if (tCheck.length() < t.length()) {
            return false;
        } else if (tCheck.toString().equals(t)) {
            return true;
        }

        // for the characters in tCheck, if it matches a corresponding character (in one loop) in t, add it to ans
        // if the first character of t is found, move on to the next, etc.
        for (int i = 0; i < tCheck.length(); i++) {
            if (tCheck.charAt(i) == t.charAt(counter)) {
                ans.append(t.charAt(counter));
                counter++;
            }
        }

        // if ans turns out to be the same as t, isHidden returns true
        return ans.toString().equals(t);
    }

}
