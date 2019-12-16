package designpattern.builder;

public class CustomerBuilder {


    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private Integer age;


    public CustomerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public CustomerBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }


    public Customer build() {
        return new Customer(this.firstName, this.lastName, this.email, this.address, this.age);
    }

}
