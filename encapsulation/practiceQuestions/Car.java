package encapsulation.practiceQuestions;
// Create a class Car with instance variables make, model, year, and speed. 
// Implement encapsulation such that the speed can only be increased by a accelerate method 
// and decreased by a brake method, and the make, model, and year can only be accessed through 
// getter methods.
class Car {
    
    private String make, model;
    private float speed;
    private int year;

    public Car(String make, String model, float speed, int year){
        this.make = make;
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    // methods for speed
    public float accelerate(int gear){
        if(gear < 3) {
            this.speed += speed * 0.5; 
        }
        else {
            this.speed += speed * 1.5;
        }
        return this.speed;
    }

    public float brake() {
        this.speed = 0;
        return this.speed;
    }

    // getter methods for make, model, year

    public String getMake(){ return this.make; }
    public String getModel(){ return this.model; }
    public int getYear(){ return this.year; }
}
