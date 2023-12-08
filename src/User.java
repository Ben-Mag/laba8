public class User {

    private String UserName;
    private String UserEmail;
    private String UserID;
    private String Password;

    public User() {
        super();
    }

    public User(String UserName, String UserEmail, String UserID, String Password) {
        this();
        this.UserName = UserName;
        this.UserEmail = UserEmail;
        this.UserID = UserID;
        this.Password = Password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean doQualityCheck() {
        return (UserName != null && !UserName.trim().isEmpty()) && (UserEmail != null && !UserEmail.trim().isEmpty())
                && (UserID != null && !UserID.trim().isEmpty()) && (Password != null && !Password.trim().isEmpty());
    }

    @Override
    public String toString() {
        // StringBuilder class also uses Builder Design Pattern with implementation of java.lang.Appendable interface
        StringBuilder builder = new StringBuilder();
        builder.append("User [UserName=").append(UserName).append(", UserEmail=").append(UserEmail).append(", UserID=").append(UserID)
                .append(", Password=").append(Password).append("]");
        return builder.toString();
    }

}