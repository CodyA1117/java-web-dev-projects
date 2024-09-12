public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student student = new Student("Cody Adams", 12345, 1, 4.0);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Number of Credits: " + student.getNumberOfCredits());
        System.out.println("GPA: " + student.getGpa());
    }
}
