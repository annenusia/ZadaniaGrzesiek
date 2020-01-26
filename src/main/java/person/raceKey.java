package person;

public class raceKey {

    private String raceName;
    private int raceYear;

    public raceKey(String raceName, int raceYear) {
        this.raceName = raceName;
        this.raceYear = raceYear;
    }

    @Override
    public String toString() {
        return raceName + raceYear;
    }
}
