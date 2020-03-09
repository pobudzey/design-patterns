package builder;

public class Client {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Maxim", "Pobudzey")
                .withAddress("Redacted")
                .build();
    }
}
