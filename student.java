package Model;
 // 1️⃣ Fields
public class student {

    private int studentId;
    private String name;
    private int age ;
    private String course;
    private double marks;

     // 2️⃣ Constructor
     public student(int studentId, String name, int age, String course, double marks) {
         this.studentId = studentId;
         this.name = name;
         this.age = age;
         this.course = course;
         this.marks = marks;
     }
    // 3️⃣ Getters/Setters
     public int getStudentId() {
         return studentId;
     }

     public void setStudentId(int studentId) {
         this.studentId = studentId;
     }

     public String getName() {
         return name;
     }
     public void setName( String name  ){
         this.name = name;
     }
     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getCourse(){
         return course;
     }
     public void setCourse(String course) {
         this.course = course;
     }

     public double getMarks(){
         return marks;
     }

     public void setMarks(double marks) {
         this.marks = marks;
     }

     @Override
     public String toString() {
         return "student :" + studentId +
                 ", Name: " + name +
                 ", Age: " + age +
                 ", Course: " + course +
                 ", Marks: " + marks;
     }
 }


