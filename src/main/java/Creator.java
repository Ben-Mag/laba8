public class Creator {

    private UserBuilder builder;

    public Creator(UserBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Creator can't work without User Builder!");
        }
    }

    public User createUser() {
        return builder.fixUserName().fixUserEmail().fixUserID().fixPassword().build();
    }

}