package register;

public class User {
    /**
     * Task 2: Create a User class in register package.
     * The class should have 3 attributes: name, birthYear, address.
     * Implement a setter and a getter to each attributes.
     * Implement a constructor.
     * In main method read, store and print these data using standard input and output.
     * Hint: Use sout to print in IntelliJ
     * Hint: Use Scanner class to get user input. System.in is the standard input
     * stream of console.
     * Create a method which tells the age of user in a given year.
     */

    private String name;
    private int birthYear;
    private String address;

    public User() {
        this("John Doe", 2000, "Baker Street");
    }

    public User(String name, int birthYear, String address) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
