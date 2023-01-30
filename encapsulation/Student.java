package encapsulation;
// Example of Tightly encapsulated class because all variables are private
public class Student {
    private String name;
    private int studentID;
    private String section;
    private static String universityName = "Coventry University"; 

    // getter methods
    public String getName(){
        return this.name;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public String getSection(){
        return this.section;
    }

    // static method only access static variables without using 'this'
    public static String getUniversityName(){
        return universityName;
    }

    // setter methods

    public void setName(String name){
        this.name = name;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public void setSection(String section){
        this.section = section;

    }
}
