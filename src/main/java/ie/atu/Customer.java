package ie.atu;

public class Customer extends Person{ // Use functionality in person
    private String customerNumber;
    private boolean mailingList;

    public Customer() {
    }

    public Customer(String name, String address, String phone, String customerNumber, boolean mailingList) {
        super(name, address, phone); // Calls parent (Person)
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                ", customerNumber='" + customerNumber + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
