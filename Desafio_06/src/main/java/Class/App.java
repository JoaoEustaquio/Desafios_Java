package Class;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
            InsertingData(student.Name, student.Age, student.Grade );
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

    public static void InsertingData(String Name, int Age, int Grade ) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection to the database");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/desafios_java","root","13141618");
            System.out.println("You are now connected to the database");

            System.out.println("Inserting data or record inter the table called students");
            stmt = conn.createStatement();

            String sql = "INSERT INTO students " +
                    "VALUES ( 'Eliel', '30', 10)";
            stmt.executeUpdate(sql);

            System.out.println("Inserted records into the table. Please verify...");
        } catch(SQLException se) {
            se.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt!=null)
                    conn.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
        }
    }
}