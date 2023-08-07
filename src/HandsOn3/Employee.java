package HandsOn3;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void calculateSalary(double percentageIncrease) {
        double increaseAmount = salary * percentageIncrease / 100;
        salary += increaseAmount;
    }

    public void updateSalary(double newSalary) {
        salary = newSalary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rohit Sharma", "Software Engineer", 50000.0);

        System.out.println("Name: " + emp.getName());
        System.out.println("Job Title: " + emp.getJobTitle());
        System.out.println("Salary: Rs " + emp.getSalary());

        emp.calculateSalary(10);
        System.out.println("After 10% increase, new Salary: Rs " + emp.getSalary());

        emp.updateSalary(55000.0);
        System.out.println("After updating Salary, new Salary: Rs " + emp.getSalary());
    }
}