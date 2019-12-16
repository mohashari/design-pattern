package designpattern.factory_method.example_1;

public class EmployeeFactory {

    public static Employee createManager(String name) {
        return new Employee(name, "Manager", 1200000L);
    }

    public static Employee createStaff(String name) {
        return new Employee(name, "staff", 800000L);
    }
}
