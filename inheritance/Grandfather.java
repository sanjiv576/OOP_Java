package inheritance;
// Example of Multi-level inheritance
class Grandfather {
    protected String name = "GrandFather";
    protected int car = 3;
    protected int house = 1;

    public Grandfather(){
        System.out.println("I am  " + name);
    }

    public void property(){
        System.out.println("Grandfather has " + car + " car and " + house + " house.");
    }

}

class Father extends Grandfather{
    protected String name = "Father";
    protected String job = "Teacher";

    public Father(){
        System.out.println("I am  " + name);
    }
    @Override
    public void property(){
        car = super.car + 1;
        house += 1;
        System.out.println("Father has " + car + " car and " + house + " house who works as a " + job);
    }

    public void hobby(){
        System.out.println("I love travelling.");
    }
}

class Son extends Father {
    protected String name = "Son";
    protected int girlfriend  = 9;

    public Son(){
        System.out.println("I am  " + name);
    }
    @Override
    public void hobby(){
        System.out.println("I love programming.");
    }
}

class Test {
    public static void main(String[] args){
        Son son = new Son();
        son.hobby();

        Father father = new Father();
        father.property();
        father.hobby();

        System.out.println("Father has " + father.car + " cars.");
        System.out.println("Son has " + son.car + " cars.");
    }
}