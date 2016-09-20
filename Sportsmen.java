package Task;


public abstract class Sportsmen {

    private String firstName ;
    private String lastName;

    protected abstract double Result();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName.matches("^[a-zA-Z]+$"))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("illegal  First name ");

    }

    public void setLastName(String lastName) {
        if (lastName.matches("^[a-zA-Z]+$"))
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("illegal Last name ");
    }
}
