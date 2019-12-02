package designpattern.builder;

public class Main {
    public static void main(String[] args) {
        Customer customer = new CustomerBuilder().setFirstName("moh").setLastName("ashari").setEmail("muklis@gmail.com").build();
        Customer customer2 = new CustomerBuilder().setFirstName("moh").setLastName("ashari").build();

        Customer customer3 = new CustomerBuilder().setFirstName("moh").setLastName("ashari").setEmail("muklis@gmail.com").setAddress("cikarang").build();
        Customer customer4 = new CustomerBuilder().setFirstName("moh").setLastName("ashari").setEmail("muklis@gmail.com").setAddress("cikarang").setAge(24).build();
    }
}
