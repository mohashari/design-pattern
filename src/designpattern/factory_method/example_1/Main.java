package designpattern.factory_method.example_1;

public class Main {

    public static void main(String[] args) {

        Employee manager = EmployeeFactory.createManager("candra");
        Employee manager1 = EmployeeFactory.createManager("hendra");

        Employee staff = EmployeeFactory.createStaff("putra");
        Employee staff1 = EmployeeFactory.createStaff("bagus");

        System.out.println("manager " + manager + " " + manager1);
        System.out.println("staff " + staff + " " + staff1);
    }
}
