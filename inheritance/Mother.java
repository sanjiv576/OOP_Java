package inheritance;
// Example of Hierarchical inheritance
class Mother {
    protected String name = "Mother";
    protected String faceShape = "oval";
    protected String hairTexture = "straight black";

    public void bodyStrcuture(){
        System.out.println(name + " has " + faceShape + " face shape and " + hairTexture + " hair.");
    }
    private void secret(){
        System.out.println("This is mama's secret cooking recepie.");
    }
}

class Sons extends Mother {

    public Sons(){
        name = "Son";
    }
    @Override
    public void bodyStrcuture(){
        faceShape = "round";
        super.bodyStrcuture();
    }
    protected void job(){
        System.out.println(name + " is jobless.");
    }
}

class Daughter extends Mother {
    // protected String name = "Daughter";

    public Daughter(){
        name = "Daughter";
    }

    @Override
    public void bodyStrcuture(){
        hairTexture = "curly brown";
        super.bodyStrcuture();
    }
}

class Neighbour {
    public static void main(String[] args){
        Daughter daughter = new Daughter();
        daughter.bodyStrcuture();

        Sons son = new Sons();
        son.bodyStrcuture();
        son.job();

        Mother mom = new Mother();
        System.out.println(mom.name);
        mom.bodyStrcuture();
        // not accessible becasue of private
        //mom.secret();

    }
}