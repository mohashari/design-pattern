package designpattern.factory_method.example_1;

public class Main {

    public static void main(String[] args) {

        // TODO: 03/12/19 problem di saat membuat object baru dengan title yang sama dan salary sama akan melakukan perulangan
        Employee manager = new Employee("candra", "manager", 1200000L);
        Employee manager1 = new Employee("hendra", "manager", 1200000L);

        Employee staff = new Employee("putra", "staff", 8000000L);
        Employee staff1 = new Employee("bagus", "staff", 8000000L);

        System.out.println("manager " + manager + " " + manager1);
        System.out.println("staff " + staff + " " + staff1);
    }
}
