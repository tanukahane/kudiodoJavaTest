package drive;

//public class q1 {
	
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int roll;
    String name;
    int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        
        students.add(new Student(01, "Thor", 83));
        students.add(new Student(02, "Aaniii", 72));
        students.add(new Student(03, "Henaa", 78));
        students.add(new Student(04, "Carrot", 97));
        students.add(new Student(05, "Ravi", 89));

       
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s2.marks, s1.marks);
            }
        });

        
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
	
