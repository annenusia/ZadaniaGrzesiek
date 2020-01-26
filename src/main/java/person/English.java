package person;

public class English extends Person {

   private boolean hasGuardian;
   private String taxNumber;

    public English(String fisrtName, String lastName, int age, String sex, boolean licence, boolean hasGuardian, String taxNumber) {
        super(fisrtName, lastName, age, sex, licence);
        this.hasGuardian = hasGuardian;
        this.taxNumber = taxNumber;
    }

    public boolean isHasGuardian() {
        return hasGuardian;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    @Override
    String getIdentity() {
        return this.taxNumber;
    }


    @Override
    public boolean canDriveCar() {
        if (getAge() > 16 && getLicence() == true)
            return true;
            return false;
    }

    @Override
    public boolean canRace() {
        if (getAge() > 14 && this.hasGuardian == true)
            return true;
            return false;
    }
}
