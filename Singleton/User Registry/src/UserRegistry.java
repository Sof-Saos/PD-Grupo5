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
        System.out.println("Usuario agregado con exito!");
    }

    public ArrayList<User> getUsers() {
        System.out.println("Lista de usuarios:");
        for (User user : userList) {
            System.out.println("Usuario: " + user.getUsername() + ", Email: " + user.getEmail());
        }
        return userList;
    }

    public User getUserByUsername(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                System.out.println("Usuario encontrado: " + user.getUsername() + ", Email: " + user.getEmail());
                return user;
            } else {
                System.out.println("Usuario no encontrado");
            }
        }
        return null;
    }
}
