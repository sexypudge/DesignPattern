package practices.builder;

public class User {
    private final String name;
    private final String age;

    private User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
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

        public UserBuilder age(String age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(name, age);
        }
    }

//    public static void main(String[] args) {
//        User user = User.builder().name("abc").build();
//        System.out.println(user.name);
//    }
}
