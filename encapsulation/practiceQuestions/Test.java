package encapsulation.practiceQuestions;

public class Test {
   public static void main(String[] args){
    // for person class
    Person person = new Person();
    person.setName("Sanjiv Shrestha");
    person.setAge(99);
    person.setAddrss("Kathmandu");

    System.out.println("Name : " + person.getName());
    System.out.println("Age : " + person.getAge());
    System.out.println("Address : " + person.getAddress());

    System.out.println();

    // for studnet class
    Student student = new Student();
    student.setAge(16);
    student.setGrade(11);
    
    System.out.println("Grade : " + student.getGrade());

    System.out.println();

    // for employee class
    Employee employee1 = new Employee("Sanjiv Shrestha", 21000, 14000.5f, 21);
    Employee employee2 = new Employee("Sudip Singh Khati", 150034, 15000.9f, 22);

    System.out.println("Employee 1 previous salary : " + employee1.getSalary());
    float rate = 2.4f;
    employee1.raiseSalary(rate);
    System.out.println("Employee 1 new salary : " + employee1.getSalary());

    System.out.println("Employee 2 details :");
    System.out.println("Employee Number : " + employee2.getEmployeeNumber());
    System.out.println("Age : " + employee2.getAge());

    System.out.println();

    // for car class
    Car car1 = new Car("BMW", "EL-102", 140, 2023);
    System.out.println("New speed : " + car1.accelerate(1));
    System.out.println("New speed : " + car1.accelerate(4));
    System.out.println("Speed when braking : " + car1.brake());
    System.out.println("Make : " + car1.getMake());
    System.out.println("Model : " + car1.getModel());
    System.out.println("Year : " + car1.getYear());
    
    System.out.println();

    // for bank account class
    BankAccount bankAccount1 = new BankAccount(4598530, 12345);
    System.out.println("Account number : " + bankAccount1.getAccountNumber());
    float amount = 1400.45f;
    bankAccount1.deposit(amount);
    System.out.println("New balance afte deposit : " + bankAccount1.getBalance());

    amount = 14700.45f;
    bankAccount1.withdraw(amount);
    System.out.println("New balance afte withdraw : " + bankAccount1.getBalance());

   }
}
