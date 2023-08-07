package HandsOn5;


class Member{
    String Name,Address;int Age,Phonenumber;
    double Salary;
    Member(String Name,String Address,int Age,int Phonenumber,double Salary){
        this.Name=Name;
        this.Address=Address;
        this.Age=Age;
        this.Phonenumber=Phonenumber;
        this.Salary=Salary;
    }
    void printsal(){
        System.out.println("Salary="+Salary);
    }}
class Employee extends Member{
    
    String specialization;
    Employee(String Name,String Address,int Age,int Phonenumber,double Salary,String specialization){
        super( Name, Address,Age,Phonenumber,Salary);
        this.specialization=specialization;
    }}
class Manager extends Member{
    String department;
    Manager(String Name,String Address,int Age,int Phonenumber,double Salary,String department){
        super( Name, Address,Age,Phonenumber,Salary);
        this.department=department;
    
}}
    
    
public class Member1
{
	public static void main(String[] args) {
	    Manager m1=new Manager("sudeep","pritech",18,987654321,100000.0,"it");
	    Employee e1=new Employee("sud2","ptower",18,987654321,200000.0,"AI");
		m1.printsal();
		e1.printsal();
	}
}