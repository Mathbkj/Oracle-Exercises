package Models;

public class Customer {
    private String Name;

    public Customer(String Name) {
        if (!(Name.isBlank()))
            this.Name = Name;
    }

    public Customer() {

    }

    public String getCustomer() {
        return Name;
    }

    public void setCustomer(String value) {
        Name = value;
    }
}
