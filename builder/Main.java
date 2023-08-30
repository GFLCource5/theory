package builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder().setLogin("exampleLogin").setPassword("examplePassword").setTimestamp(1111L).build();
        System.out.println(user);

    }
}
