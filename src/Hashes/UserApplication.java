package Hashes;

import java.util.Map;
import java.util.HashMap;

public class UserApplication {
    public static void main(String[] args) {
        Map<User, User> users = new HashMap<>();
        User user1 = new User(1, "John", "john@domain.com","155");
        User user2 = new User(2, "Jennifer", "jennifer@domain.com","023202202");
        User user3 = new User(1, "John", "john@domain.com","8299351245");

        users.put(user1, user1);
        users.put(user2, user2);
        System.out.println("Hashcorde de user1: "+user1.hashCode());

    }
}
