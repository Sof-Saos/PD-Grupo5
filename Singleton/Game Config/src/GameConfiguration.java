public class GameConfiguration {
    private static GameConfiguration config;
    private String gameDifficult;
    private int gameVolume;
    private String graphicOptions;
    private GameConfiguration() {

    }
    public static synchronized GameConfiguration getInstance() {
        if (config == null) {
            config = new GameConfiguration();
        }
        return config;
    }

    public String getGameDifficult() {
        return gameDifficult;
    }

    public int getGameVolume() {
        return gameVolume;
    }

    public String getGraphicOptions() {
        return graphicOptions;
    }

    public void setGameDifficult(String difficult) {
        this.gameDifficult = difficult;
    }

    public void setGameVolume(int volume) {
        this.gameVolume = volume;
    }

    public void setGraphicOptions(String graphicOptions) {
        this.graphicOptions = graphicOptions;
    }
}
