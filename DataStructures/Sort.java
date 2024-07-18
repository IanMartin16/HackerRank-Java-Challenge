import java.io.*;
import java.util.*;

class Student {
    private int id;
    private String firstName;
    private double cgpa;
    
    public Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public double getCgpa() {
        return cgpa;
    }
}
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        
        if (s1.getCgpa() != s2.getCgpa()) {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        } else {
            
            int nameComparison = s1.getFirstName().compareTo(s2.getFirstName());
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                return Integer.compare(s1.getId(), s2.getId());
            }
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        List<Student> students = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String firstName = scanner.next();
            double cgpa = scanner.nextDouble();
            students.add(new Student(id, firstName, cgpa));
        }
        
        Collections.sort(students, new StudentComparator());
        
        for (Student student : students) {
            System.out.println(student.getFirstName());
        }
        scanner.close();
    }
}