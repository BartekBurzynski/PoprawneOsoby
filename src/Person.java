public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {
        if (firstName == null||firstName.length() < 2) {
            throw new NameUndefinedException();

        }
        if (lastName == null||lastName.length() < 2) {
            throw new NameUndefinedException();
        }

        if (age < 1) {
            throw new IncorrectAgeException();
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;




    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (firstName == null||firstName.length() < 2) {
            throw new NameUndefinedException();
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (lastName == null||lastName.length() < 2) {
            throw new NameUndefinedException();
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 1) {
            throw new IncorrectAgeException();
        }
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