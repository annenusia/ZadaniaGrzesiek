package person;

import java.util.Objects;

public class Polish extends Person implements Driver {

    private String nationality;
    private int children;
    private String pesel;


    public Polish(String fisrtName, String lastName, int age, String sex, boolean licence, int children, String pesel) {
        super(fisrtName, lastName, age, sex, licence);
        this.nationality = "polish";
        this.children = children;
        this.pesel = pesel;
    }

    @Override
    public boolean isRetired() {
        if (getSexShortName() == Sex.WOMAN.getShortName() && getAge() > 60)
            return true;
        if (getSexShortName() == Sex.MAN.getShortName() && getAge() > 65)
            return true;
        return false;
    }

    public boolean enabledKdr (){
        if (this.children >= 3)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Polish{ " + super.toString() +
                "nationality='" + nationality + '\'' +
                ", children=" + children +
                '}';
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    String getIdentity() {
        return pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polish polish = (Polish) o;
       return Objects.equals(pesel, polish.pesel) &&
               Objects.equals(getLastName() + getFirstName(),
                       polish.getLastName() + polish.getFirstName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(pesel + getLastName() + getFirstName());
    }

    @Override
    public boolean canDriveCar() {
        if (getAge() > 16 && getLicence() == true)
        return true;
        return false;
    }

    @Override
    public boolean canRace() {
        if (getAge() > 10)
        return true;
        return false;
    }
}
