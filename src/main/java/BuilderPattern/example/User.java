//package BuilderPattern.example;
//
//public class User {
//
//    private String name;
//
//    private String age;
//
//    private User(String name, String age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public static class UserBuilder {
//        private String name;
//
//        private String age;
//
//        public UserBuilder setName(String name){
//            this.name = name;
//            return this;
//        }
//
//        public UserBuilder setAge(String age){
//            this.age = age;
//            return this;
//        }
//
//        public User buildUser(){
//            return new User(name, age);
//        }
//    }
//
//    public static void main(String[] args) {
//        User user = new UserBuilder().setAge("").setName("").buildUser();
//    }
//}
