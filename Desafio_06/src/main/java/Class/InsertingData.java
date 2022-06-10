package Class;

import java.sql.*;
import java.sql.DriverManager;

//public class InsertingData {
//    public static void main(String args[]) {
//        Connection conn = null;
//        Statement stmt = null;
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Connection to the database");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/desafios_java","root","13141618");
//            System.out.println("You are now connected to the database");
//
//            System.out.println("Inserting data or record inter the table called students");
//            stmt = conn.createStatement();
//
//            String sql = "INSERT INTO students " +
//                    "VALUES ( 'Eliel', '30', 10)";
//            stmt.executeUpdate(sql);
//
//            System.out.println("Inserted records into the table. Please verify...");
//        } catch(SQLException se) {
//            se.printStackTrace();
//        } catch(Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if(stmt!=null)
//                    conn.close();
//            } catch(SQLException se) {
//                se.printStackTrace();
//            }
//        }
//    }
//}
