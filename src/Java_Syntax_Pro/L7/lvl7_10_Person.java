package Java_Syntax_Pro.L7;

public class lvl7_10_Person {
    private String firstName;
    private String lastName;

    public lvl7_10_Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}
