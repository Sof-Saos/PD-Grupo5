import java.util.ArrayList;

public class UserRegistry {
    private static UserRegistry instance;
    private ArrayList<User> userList;

    private UserRegistry() {
        userList = new ArrayList<>();
    }

    public static synchronized UserRegistry getInstance() {
        if (instance == null) {
            instance = new UserRegistry();
        }
        return instance;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public List<User> getUsers() {
        return userList;
    }

    public User getUserByUsername(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}