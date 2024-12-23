package J06006;

public class Customer {
    private String id, name, gender, dob, address;

    public Customer(int id, String name, String gender, String dob, String address) {
        this.id = String.format("KH%03d", id);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
