package encapsulation;
public class Driver {

    // static method
    public static void studentInfo(String studentName, int id, String sec, String universityName){
        System.out.println(studentName + " studies in " + universityName + 
        ", who is currently in " + sec + " section and his student id is " + id);
    }

    public static void main(String[] args){
        Encapsulation encap = new Encapsulation();
        encap.setName("Sanjiv Shrestha");
        System.out.println(encap.getName());
        System.out.println("He lives in " + encap.address);

        Student student = new Student();
        student.setName("Sanjiv Shrestha");
        student.setStudentID(21000);
        student.setSection("30B");

        String StudentName = student.getName();
        int studentID = student.getStudentID();
        String sec = student.getSection();
        // since getUniversityName is a static method which does not need an object to invoke it
        String universityName = Student.getUniversityName();

        Driver.studentInfo(StudentName, studentID, sec, universityName);
    }
}
