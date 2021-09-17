package uni.project.simulation;

public class Vaccine {
    private String name;
    private int doses;
    private int daysBetweenDoses;
    private int efficacy;

    public Vaccine(String name, int doses, int daysBetweenDoses, int efficacy) {
        this.name = name;
        this.doses = doses;
        this.daysBetweenDoses = daysBetweenDoses;
        this.efficacy = efficacy;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "name='" + name + '\'' +
                ", doses=" + doses +
                ", daysBetweenDoses=" + daysBetweenDoses +
                ", efficacy=" + efficacy +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoses() {
        return doses;
    }

    public void setDoses(int doses) {
        this.doses = doses;
    }

    public int getDaysBetweenDoses() {
        return daysBetweenDoses;
    }

    public void setDaysBetweenDoses(int daysBetweenDoses) {
        this.daysBetweenDoses = daysBetweenDoses;
    }

    public int getEfficacy() {
        return efficacy;
    }

    public void setEfficacy(int efficacy) {
        this.efficacy = efficacy;
    }
}
