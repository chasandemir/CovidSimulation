package uni.project.simulation;

import java.util.concurrent.ThreadLocalRandom;

public class Person {
    public enum Status {
        VaccinatedHealthy,
        VaccinatedPatient,
        UnvaccinatedHealthy,
        UnvaccinatedPatient
    }
    private Status status;
    private Boolean sick;
    private int sickDays;
    private Boolean isolation;
    private int boardSize;
    private int posX;
    private int posY;
    private Vaccine vaccine;
    private int moveRate;

    public Person(Status status, Boolean sick, int sickDays, Boolean isolation, int posX, int posY, int boardSize, Vaccine vaccine, int moveRate) {
        this.status = status;
        this.sick = sick;
        this.sickDays = sickDays;
        this.isolation = isolation;
        this.boardSize = boardSize;
        this.posX = posX;
        this.posY = posY;
        this.vaccine = vaccine;
        this.moveRate = moveRate;
    }

    public void nextPos() {
        int move = ThreadLocalRandom.current().nextInt(0, moveRate + 1);
        if (move < moveRate) {
            this.isolation = true;

            return;
        }

        int randomX = ThreadLocalRandom.current().nextInt(0, boardSize + 1);
        int randomY = ThreadLocalRandom.current().nextInt(0, boardSize + 1);

    }

    @Override
    public String toString() {
        return "Person{" +
                "status=" + status +
                ", sick=" + sick +
                ", sickDays=" + sickDays +
                ", isolation=" + isolation +
                '}';
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public int getMoveRate() {
        return moveRate;
    }

    public void setMoveRate(int moveRate) {
        this.moveRate = moveRate;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Boolean getSick() {
        return sick;
    }

    public void setSick(Boolean sick) {
        this.sick = sick;
    }

    public int getSickDays() {
        return sickDays;
    }

    public void setSickDays(int sickDays) {
        this.sickDays = sickDays;
    }

    public Boolean getIsolation() {
        return isolation;
    }

    public void setIsolation(Boolean isolation) {
        this.isolation = isolation;
    }
}
