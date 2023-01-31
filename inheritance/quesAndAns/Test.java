package inheritance.quesAndAns;

public class Test {
    public static void main(String[] args){
        // for circle class
        Circle circle = new Circle();
        circle.area(1.24);

        Rectangele rect = new Rectangele();
        rect.area(11.23, 10.2);

        Triangle tri = new Triangle();
        tri.area(14.0, 12.3);

        System.out.println();
        System.out.println();

        // for Vehicle class

        Bike bike = new Bike();
        bike.property();

        Car car = new Car();
        car.property();

        Bus bus = new Bus();
        bus.property();

        System.out.println();
        System.out.println();

        // for employee class
        CEO c = new CEO();
        c.showSalary();

        Manager m = new Manager();
        m.showSalary();
    }
}
