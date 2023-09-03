public class ConfigurationSetter {
    private static ConfigurationSetter configSetter;

    public ConfigurationSetter() {
    }

    public static synchronized ConfigurationSetter getInstance() {
        if (configSetter == null) {
            configSetter = new ConfigurationSetter();
        }
        return configSetter;
    }

    public void setConfig(String difficult, int volume, String graphicOptions){
        GameConfiguration configuration2 = GameConfiguration.getInstance();

        configuration2.setGameDifficult(difficult);
        configuration2.setGameVolume(volume);
        configuration2.setGraphicOptions(graphicOptions);

    }
}
