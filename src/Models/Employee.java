package Models;

public class Employee extends Department {
    private final String FirstName;
    private final String LastName;

    public Employee(String FK_Dept, String FirstName, String LastName) {
        super(FK_Dept);
        if (!FirstName.isEmpty())
            this.FirstName = FirstName;
        else throw new Error("Must Contain Characters)");
        if (!LastName.isEmpty())
            this.LastName = LastName;
        else throw new Error("Must Contain Characters)");
        System.out.println(FK_Dept);
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
}
