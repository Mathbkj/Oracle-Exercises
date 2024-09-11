import Models.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomer("Math");
        System.out.print(customer.getCustomer());
    }
}