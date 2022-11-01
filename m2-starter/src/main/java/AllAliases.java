import java.util.*;

public class AllAliases {

    public static HashMap<Integer, Integer> findAllAliases(Account[] accounts) {
        // Implement me
        HashMap<Integer, Integer> ans = new HashMap<>();

        for (Account account : accounts) {
            for (int j = 1; j < accounts.length; j++) {
                if (
                        account.getDisplayName().equals(accounts[j].getDisplayName()) ||
                                account.getEmail().equals(accounts[j].getEmail()) ||
                                account.getPhoneNo().equals(accounts[j].getPhoneNo())
                )
                    ans.put(account.getId(), accounts[j].getId());
            }
        }
        return ans;
    }
}
