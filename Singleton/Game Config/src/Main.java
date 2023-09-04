public class Main {
    public static void main(String[] args) {
        ConfigurationSetter setter1 = ConfigurationSetter.getInstance();
        ConfigurationGetter getter1 = ConfigurationGetter.getInstance();

        setter1.setConfig("Easy", 30, "Low");
        getter1.getConfig();
        System.out.println("=======");

        setter1.setConfig("Medium", 60, "Medium");
        getter1.getConfig();
        System.out.println("=======");

        setter1.setConfig("Hard", 100, "High");
        getter1.getConfig();
        System.out.println("=======");
    }
}