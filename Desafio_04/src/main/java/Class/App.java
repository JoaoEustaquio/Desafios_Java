package Class;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        int studentQTD;

        System.out.println("Hello, inform how much students is in your class.");
        studentQTD = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < studentQTD; i++)
        {
            System.out.println("Type the student name: ");
            String name = in.nextLine();

            System.out.println("Type the student Age: ");
            int age = Integer.parseInt(in.nextLine());

            System.out.println("Type the student grade: ");
            int grade = Integer.parseInt(in.nextLine());
            Student student = new Student();
            student.Name = name;
            student.Grade = grade;
            student.Age = age;

            studentList.add(student);
        }

        Student highestGrade = new Student();
        highestGrade.Grade = 0;
        for (Student student : studentList) {
            if (student.Grade > highestGrade.Grade)
            {
                highestGrade = student;
            }
        }

        System.out.println(" ");
        System.out.println("The student with the highest grade is: " );
        System.out.println("Name: " + highestGrade.Name);
        System.out.println("Age: " + highestGrade.Age);
        System.out.println("Grade: " + highestGrade.Grade);

    }
}