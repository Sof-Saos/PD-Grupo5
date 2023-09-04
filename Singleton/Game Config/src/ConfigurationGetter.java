public class ConfigurationGetter {
    private static ConfigurationGetter configGetter;

    public ConfigurationGetter() {
    }

    public static synchronized ConfigurationGetter getInstance() {
        if (configGetter == null) {
            configGetter = new ConfigurationGetter();
        }
        return configGetter;
    }

    public void getConfig () {
        GameConfiguration configuration3 = GameConfiguration.getInstance();

        System.out.println(configuration3.getGameDifficult());
        System.out.println(configuration3.getGameVolume());
        System.out.println(configuration3.getGraphicOptions());
    }
}
