package Main;

public class Customer {
    private String address;
    private String name;

    public Customer(String address, String name){
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer: " +
                  name +
                " address: " + address;
    }
}
