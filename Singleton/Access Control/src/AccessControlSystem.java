import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessControlSystem {
    private static AccessControlSystem instance;
    private List<User> registeredUsers;
    private Map<String, Boolean> doorStates;

    private AccessControlSystem() {
        registeredUsers = new ArrayList<>();
        doorStates = new HashMap<>();
    }

    public static AccessControlSystem getInstance() {
        if (instance == null) {
            instance = new AccessControlSystem();
        }
        return instance;
    }

    public void addUser(User user) {
        registeredUsers.add(user);
    }

    public boolean validateAccess(User user, String doorId) {
        if (registeredUsers.contains(user)) {
            Boolean doorState = doorStates.getOrDefault(doorId, false);
            return doorState;
        }
        return false;
    }

    public void changeDoorState(String doorId, boolean isOpen) {
        doorStates.put(doorId, isOpen);
    }
}