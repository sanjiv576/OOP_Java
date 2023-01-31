package inheritance;
// Example of Single Inheritance
class Bird {
    
    protected String name;
    protected String color = "White";
    public void fly(){
        System.out.println("I can fly high in the sky.");
    }

}

class Crow extends Bird{
    public void printColor(){
        String color = "Black";
        System.out.println(super.color);
        System.out.println(color);
    }
    public static void main(String[] args){
        Crow c = new Crow();
        c.fly();
        c.printColor();
    }
}
