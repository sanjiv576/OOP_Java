package inheritance.quesAndAns;
/*
 * Create a class "Vehicle" with subclasses "Car", "Bike" and "Bus". 
 * Implement methods for each class to show the attributes of each vehicle 
 * such as number of wheels, speed, etc.
 */
class Vehicle {
    protected int wheels;
    protected String name;
    protected float maxSpeed;
    public void property(){
        System.out.println(name + " has " + wheels + " wheels and " + maxSpeed + " max speed.");
    }
}

class Car extends Vehicle{

    public Car(){
        name = "Car";
        wheels = 4;
        maxSpeed = 150;
    }
    
}

class Bike extends Vehicle{

    public Bike(){
        name = "Bike";
        wheels = 2;
        maxSpeed = 120;
    }
    
}

class Bus extends Vehicle{

    public Bus(){
        name = "Bus";
        wheels = 4;
        maxSpeed = 130;
    }
    
}


