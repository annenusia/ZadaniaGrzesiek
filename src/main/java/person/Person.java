package person;

public abstract class Person implements Driver{

    private String fisrtName;
    private String lastName;
    private int age;
    private Sex sex;
    private boolean licence;

    public Person(String fisrtName, String lastName, int age, String sex, boolean licence) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.age = age;
        this.sex = Sex.getByShortName(sex);
        this.licence = licence;
    }

    public String getFirstName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexShortName() {
        return sex.getShortName();
    }

    public boolean getLicence() {
       return licence;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex.getShortName() + '\'' +
                '}';
    }

    public boolean isRetired () {
        if (this.sex == Sex.WOMAN && this.age > 65)
            return true;
            if (this.sex == Sex.MAN && this.age > 67)
                return true;
            return false;
        }

        abstract String getIdentity ();
    }

