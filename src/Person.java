public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;

        if (firstName == null||firstName.length() < 2) {
            throw new NumberFormatException();
        }
        if (lastName == null||lastName.length() < 2) {
            throw new NameUndefinedException();
        }

        if (age < 1) {
            throw new IncorrectAgeException();
        }


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return
                "imię " + firstName +
                " nazwisko " + lastName +
                " wiek " + age +
                " pesel " + pesel;

    }
}