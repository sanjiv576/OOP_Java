package inheritance.quesAndAns;
/*
 * Implement a base class for shape, with subclasses for circle, rectangle, and 
 * triangle, and an example program to compute the area of each shape using inheritance 
 * and polymorphism.
 */
class Shape {
    public void area(){
        System.out.println("This is parent area method");
    }
}

class Circle extends Shape{

    public void area(double radius){
        System.out.println("Area of the circel is : " + (22/7) * (radius * radius));
    }
}

class Rectangele extends Shape{
    public void area(double length, double breadth){
        System.out.println("Area of the rectangele is : " + length * breadth);
    }
}

class Triangle extends Shape{
    public void area(double base, double height){
        System.out.println("Area of the triangle is : " + base * height * 0.5);
    }
}
