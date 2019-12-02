package designpattern.builder;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("moh", "ashari ", "muklis@gmail.com");
        Customer customer2 = new Customer("moh", "ashari ", "muklis@gmail.com");

        // TODO: 02/12/19 jika pojo di tambah maka akan menambah juga constractornya sehingga akan membuat inisialisasi object juga akan bertambah

        // TODO: 02/12/19 open comment
//        Customer customer3 = new Customer("moh","ashari ","muklis@gmail.com","cikarang");
//        Customer customer4 = new Customer("moh","ashari ","muklis@gmail.com","cikarang",24);
    }
}
