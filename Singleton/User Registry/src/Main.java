    import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            UserRegistry userRegistry = UserRegistry.getInstance();

            User mario = new User("Mario", "mario@ejemplo.com", "123456");
            User maria = new User("Maria", "maria@ejemplo.com", "7890");
            userRegistry.addUser(mario);
            userRegistry.addUser(maria);

            userRegistry.getUsers();

            userRegistry.getUserByUsername("Pepe");
            userRegistry.getUserByUsername("Mario");
        }
    }