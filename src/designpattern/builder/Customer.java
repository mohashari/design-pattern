package designpattern.builder;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;

    private String address;
    private Integer age;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Customer(String firstName, String lastName, String email,String address, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.age = age;
    }
}
