public class Main {
    public static void main(String[] args) {
        AccessControlSystem access = AccessControlSystem.getInstance();

        User lupita = new User("123", "Lupita");
        User juan = new User("456", "Juan");

        access.addUser(lupita);
        access.addUser(juan);

        access.changeDoorState("43", true);
        access.changeDoorState("56", false);

        boolean access1 = access.validateAccess(lupita, "43");
        boolean access2 = access.validateAccess(juan, "56");

        System.out.println("Acceso de Lupita a Puerta1: " + access1);
        System.out.println("Acceso de Juan a Puerta2: " + access2 + "\n");

        access.changeDoorState("43", false);
        access.changeDoorState("56", true);

        boolean access3 = access.validateAccess(lupita, "43");
        boolean access4 = access.validateAccess(juan, "56");

        System.out.println("Acceso de Lupita a Puerta1: " + access3);
        System.out.println("Acceso de Juan a Puerta2: " + access4);
    }
}