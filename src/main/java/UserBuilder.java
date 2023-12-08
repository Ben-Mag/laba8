public interface UserBuilder {

    // Step 1
    public UserBuilder fixUserName();

    // Step 2
    public UserBuilder fixUserEmail();

    // Step 3
    public UserBuilder fixUserID();

    // Step 4
    public UserBuilder fixPassword();

    // delivery of Use
    public User build();
}