package person;
import person.Person;
import java.util.ArrayList;
import java.util.List;

public class Race implements Comparable<Race> {
    private String raceName;
    private List<Person> drivers;
    private int minimumAge;
    private int raceYear;

    public Race(String raceName, int minimumAge) {
        this.raceName = raceName;
        this.minimumAge = minimumAge;
        drivers = new ArrayList<>();
    }
    public Race(String raceName) {
        this.raceName = raceName;
        drivers = new ArrayList<>();
    }
    public String getRaceName() {
        return raceName;
    }
    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }
    public int getMinimumAge() {
        return minimumAge;
    }
    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }
    public int getRaceYear() {
        return raceYear;
    }
    public void setRaceYear(int raceYear) {
        this.raceYear = raceYear;
    }
    public List<Person> getDrivers() {
        return drivers;
    }
    public boolean addDriver(Person driver) {
        if(isDriverOnList(driver)){
            System.out.println("Kierowca "+driver.getLastName()
                    +" "+driver.getFirstName()
                    +" juz jest na liscie startowej");
            return false;
        }
        if (driver.getAge() >= minimumAge) {
            System.out.println("Kierowca "+driver.getLastName()
                    +" "+driver.getFirstName()+" dodany do wyscigu");
            return drivers.add(driver);
        }
        return false;
    }
    private boolean isDriverOnList(Person driver) {
        return drivers.indexOf(driver) >= 0;
    }
    public boolean removeDriver(Person driver) {
        if(!isDriverOnList(driver)){
            System.out.println("Kierowcy "+driver.getLastName()
                    +" "+driver.getFirstName()
                    +" nie ma na liscie startowej");
            return false;
        }
        return drivers.remove(driver);
    }
    @Override
    public String toString() {
        return "Race{" +
                "raceName='" + raceName + '\'' +
                ", minimumAge=" + minimumAge +
                "\ndrivers=" + printDrivers() +
                '}';
    }
    private String printDrivers(){
        String driversList = "";
        for(Person driver : drivers){
            driversList += "\n"
                    + driver.getLastName() + " " + driver.getFirstName();
        }
        return driversList+"\n";
    }
    @Override
    public int compareTo(Race o) {
        return o.getMinimumAge() - minimumAge;
    }


}





