package encapsulation.practiceQuestions;
// Create a class Employee with instance variables name, employeeNumber, salary, and age. 
// Implement encapsulation such that the salary can only be changed through a raiseSalary method 
// and accessed through a getSalary method, and the employee number and age can only be set
//  in the constructor and accessed through getter methods.


public class Employee {
    
    private String employeeName;
    private int employeeNumber;
    private float salary;
    private int age;

    public Employee(String employeeName, int employeeNumber, float salary, int age){
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.salary = salary;
        this.age = age;
    }

    // setter and getter methods for salary
    public void raiseSalary(float rate){
        this.salary += this.salary * rate;
    }

    public float getSalary(){
        return this.salary;
    }

    // getter methods for employee number and age

    public int getEmployeeNumber(){
        return this.employeeNumber;
    }
    
    public int getAge() { return this.age; }
}
