package introexception.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int yearOfBirth) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name must not be empty");
        }

        if(yearOfBirth <= 1900){
            throw new IllegalArgumentException("Invalid year of birth: " + yearOfBirth);
        }
        if(!new SsnValidator().isValidSsn(ssn))
            throw new IllegalArgumentException("Invalid Social Security Number: " + ssn);

        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
