package BuilderPattern.builder;

public class User {

    private String name;

    private String age;

    private User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }


    public static class UserBuilder {
        private String name;

        private String age;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }


        public User build() {
            return new User(name, age);
        }
    }

    public static void main(String[] args) {
        User user = User.builder().name("Luong").build();
        practices.builder.User user1 = null;

    }
}
