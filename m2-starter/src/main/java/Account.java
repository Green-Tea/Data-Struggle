import java.util.Objects;

public class Account {
    private int id;
    private String displayName;
    private String email;
    private String phoneNo;

    public Account(int id, String displayName, String email, String phoneNo) {
        this.id = id;
        this.displayName = displayName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                Objects.equals(displayName, account.displayName) &&
                Objects.equals(email, account.email) &&
                Objects.equals(phoneNo, account.phoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, displayName, email, phoneNo);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", displayName='" + displayName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }

    public int getId() { return id; }
    public String getDisplayName() { return displayName; }
    public String getEmail() { return email; }
    public String getPhoneNo() { return phoneNo; }
}
