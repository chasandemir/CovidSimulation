package uni.project.simulation;

public class Settings {

    // INITIAL VALUES
    private final static boolean _saveProgression = true;
    private final static int _boardSize = 14;
    private final static int _initialPopulation = 4;
    private final static int _moveRate = 50;

    private boolean saveProgression;
    private int boardSize;
    private int initialPopulation;
    private int moveRate;
    private Vaccine[] vaccines;

    public Settings(boolean saveProgression, int boardSize, int initialPopulation, int moveRate) {
        this.saveProgression = saveProgression;
        this.boardSize = boardSize;
        this.initialPopulation = initialPopulation;
        this.moveRate = moveRate;
        vaccines = new Vaccine[4];
        // data from https://www.biospace.com/article/comparing-covid-19-vaccines-pfizer-biontech-moderna-astrazeneca-oxford-j-and-j-russia-s-sputnik-v/
        vaccines[0] = new Vaccine("Pfizer-BioNTech", 2, 21, 95);
        vaccines[1] = new Vaccine("Moderna", 2, 28, 95);
        vaccines[2] = new Vaccine("AstraZeneca-University of Oxford", 2, 28, 70);
        vaccines[3] = new Vaccine("Johnson & Johnson", 1, 0, 69);
    }


    public Settings() {
        setDefaultSettings();
        vaccines = new Vaccine[4];
        // data from https://www.biospace.com/article/comparing-covid-19-vaccines-pfizer-biontech-moderna-astrazeneca-oxford-j-and-j-russia-s-sputnik-v/
        vaccines[0] = new Vaccine("Pfizer-BioNTech", 2, 21, 95);
        vaccines[1] = new Vaccine("Moderna", 2, 28, 95);
        vaccines[2] = new Vaccine("AstraZeneca-University of Oxford", 2, 28, 70);
        vaccines[3] = new Vaccine("Johnson & Johnson", 1, 0, 69);
    }

    @Override
    public String toString() {
        return "Settings{\n" +
                "saveProgression: " + saveProgression +
                ",\tboardSize: " + boardSize +
                ",\tinitialPopulation: " + initialPopulation +
                ",\tmoveRate: " + moveRate +
                "\n}";
    }

    public void setDefaultSettings() {
        setSaveProgression(_saveProgression);
        setBoardSize(_boardSize);
        setInitialPopulation(_initialPopulation);
        setMoveRate(_moveRate);
    }

    public boolean isSaveProgression() {
        return saveProgression;
    }

    public void setSaveProgression(boolean saveProgression) {
        this.saveProgression = saveProgression;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public int getInitialPopulation() {
        return initialPopulation;
    }

    public void setInitialPopulation(int initialPopulation) {
        this.initialPopulation = initialPopulation;
    }

    public int getMoveRate() {
        return moveRate;
    }

    public void setMoveRate(int moveRate) {
        this.moveRate = moveRate;
    }

    public Vaccine[] getVaccines() {
        return vaccines;
    }

    public void setVaccines(Vaccine[] vaccines) {
        this.vaccines = vaccines;
    }

}
