public class Palindrome extends LinkedListDeque implements Deque{
    public Deque<Character> wordToDeque(String word) {
        Deque<Character> ans = new LinkedListDeque();
        for (int i = 0; i < word.length(); i++) {
            ans.addLast(word.charAt(i));
        }
        return ans;
    }

    public boolean isPalindrome(String word) {
        Deque<Character> d = wordToDeque(word);
        int reverseIndex = d.size() - 1;

        for (int i = 0; i < d.size()/2; i++) {
            if (d.get(i) != d.get(reverseIndex)) {
                return false;
            }
            reverseIndex--;
        }
        return true;
    }

    public boolean isPalindrome(String word, CharacterComparator cc) {
        Deque<Character> d = wordToDeque(word);
        int reverseIndex = d.size() - 1;

        for (int i = 0; i < d.size()/2; i++) {
            char current = d.get(i);
            char reverseCurrent = d.get(reverseIndex);
            if (!cc.equalChars(current, reverseCurrent)) {
                return false;
            }
            reverseIndex--;
        }
        return true;
    }

}