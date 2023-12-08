public class MasseurUserBuilder implements UserBuilder {

    protected String UserName;
    protected String UserEmail;
    protected String UserID;
    protected String Password;

    public MasseurUserBuilder() {
        super();
    }

    @Override
    public UserBuilder fixUserName() {
        System.out.println("Filling in the user name field");
        this.UserName = UserName;
        return this;
    }

    @Override
    public UserBuilder fixUserEmail() {
        System.out.println("Filling in the user email field");
        this.UserEmail = UserEmail;
        return this;
    }

    @Override
    public UserBuilder fixUserID() {
        System.out.println("Filling in the user ID field");
        this.UserID = UserID;
        return this;
    }

    @Override
    public UserBuilder fixPassword() {
        System.out.println("Filling in the user password field");
        this.Password = Password;
        return this;
    }

    @Override
    public User build() {
        User user = new User(UserName, UserEmail, UserID, Password);
        if (user.doQualityCheck()) {
            return user;
        } else {
            System.out.println("User data is not completely filled in. Cannot create.");
        }
        return null;
    }

}