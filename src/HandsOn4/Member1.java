package HandsOn4;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Member1 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();
        emp.name = "John Doe";
        emp.age = 30;
        emp.phoneNumber = "1234567890";
        emp.address = "123 Main St, City";
        emp.salary = 50000.0;
        emp.specialization = "Software Development";

        // Create a Manager object
        Manager mgr = new Manager();
        mgr.name = "Jane Smith";
        mgr.age = 35;
        mgr.phoneNumber = "9876543210";
        mgr.address = "456 Park Ave, Town";
        mgr.salary = 80000.0;
        mgr.department = "Operations";

        // Print employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        System.out.println();

        // Print manager details
        System.out.println("Manager Details:");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone Number: " + mgr.phoneNumber);
        System.out.println("Address: " + mgr.address);
        mgr.printSalary();
        System.out.println("Department: " + mgr.department);
    }
}
