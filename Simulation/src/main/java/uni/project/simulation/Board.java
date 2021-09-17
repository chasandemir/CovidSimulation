package uni.project.simulation;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private int[][] board;
    private Person[] population;
    private Settings settings;

    public Board(Settings settings) {
        this.settings = settings;
        int size = settings.getBoardSize();
        this.board = new int[size][size];

        this.population = new Person[settings.getInitialPopulation()];
        initializePopulation();
    }

    private void initializePopulation() {
        boolean sick = false;
        Vaccine vaccine = null;
        int sickDays = 0;


        for (Person p: this.population) {
            int randomStatus = ThreadLocalRandom.current().nextInt(0, Person.Status.values().length + 1);
            int randomX = ThreadLocalRandom.current().nextInt(0, board.length + 1);
            int randomY = ThreadLocalRandom.current().nextInt(0, board.length + 1);
            int randomVaccine = ThreadLocalRandom.current().nextInt(0, 4 + 1);

            Person.Status status = Person.Status.values()[randomStatus];

            if (status == Person.Status.UnvaccinatedPatient || Person.Status.values()[randomStatus] == Person.Status.VaccinatedPatient) {
                sick = true;
                sickDays = 14;
            }

            if (status == Person.Status.VaccinatedPatient || status == Person.Status.VaccinatedHealthy) {
                vaccine = settings.getVaccines()[randomVaccine];
            }

            p = new Person(Person.Status.values()[randomStatus],sick,sickDays, false, randomX, randomY, board.length, vaccine, settings.getMoveRate());
        }
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public Person[] getPopulation() {
        return population;
    }

    public void setPopulation(Person[] population) {
        this.population = population;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
