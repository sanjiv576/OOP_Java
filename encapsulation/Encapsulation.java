package encapsulation;
// Example: Encapsulation and data hiding
// Note: Tightly encapsulated class is the class which has all variables/fields as private regardless contains getter and setter methods
class Encapsulation {
    // encapsulate name only but not address
    private String name;
    public String address = "Kathmandu";

    // getter/accessor method
    public String getName(){
        return this.name;
    }

    // setter/mutator method
    public void setName(String name){
        this.name = name;
    }

   
}

// Note: to achieve encapsulation: declare the variable as private and provide setter and getter methods
// Note: to achieve data hiding: declare the variables as private for restriction access from outer class