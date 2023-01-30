package encapsulation.practiceQuestions;
// Create a class Person with instance variables name, age, and address. 
// Use encapsulation to make sure that the variables can only be accessed through getter 
// and setter methods.

public class Person {
    private String name;
    private int age;
    private String address;

    // setter/mutator methods
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public void setAddrss(String address){
        this.address = address;
    }

    // getter/accessor methods

    public String getName(){ return this.name; }
    public int getAge() { return this.age; }
    public String getAddress() { return this.address; }
}
