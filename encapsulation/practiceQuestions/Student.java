package encapsulation.practiceQuestions;
// Create a class Student with instance variables name, studentNumber, grade, and age.
//  Implement encapsulation such that the grade can only be set through a setGrade method and
//  accessed through a getGrade method, and the age can only be set through a setAge method.

class Student {
    
    private String name;
    private int grade;
    private String studentNumber;
    private int age = 12;

    // getter and setter methods for only grade
    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getGrade(){ return this.grade; }

    // setter method only age
    public void setAge(int age){
        this.age = age;
    }
}
