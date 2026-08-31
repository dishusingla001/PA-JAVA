package src;
import java.sql.*;

class StudentThread extends Thread{

  @Override

  public void run(){
    String url = "jdbc:mysql://localhost:3306/studentdb";
    String username = "root";
    String password = "1234";

    String query = "Select * from student";

    try{
      Connection con = DriverManager.getConnection(
        url,username,password
      );

      Statement stmt = con.createStatement();

      ResultSet rs = stmt.executeQuery(query);

      System.out.println("------ Students -------");

      while(rs.next()){
        System.out.println(
          rs.getInt("id") + " " +
          rs.getString("name") + " " +
          rs.getInt("age") + " " +
          rs.getString("email") + " " +
          rs.getString("course")
        );
      }

      con.close();
    }catch(SQLException e){
      e.printStackTrace();
    }
  }
}

class DepartmentThread extends Thread{

  @Override

  public void run(){
    String url = "jdbc:mysql://localhost:3306/student_db";
    String username = "root";
    String password = "1234";

    String query = "Select * from dept";

    try{
      Connection con = DriverManager.getConnection(
        url,username,password
      );

      Statement stmt = con.createStatement();

      ResultSet rs = stmt.executeQuery(query);

      System.out.println("------ Students -------");

      while(rs.next()){
        System.out.println(
          rs.getInt("did") + " " +
          rs.getString("name")
        );
      }

      con.close();
    }catch(SQLException e){
      e.printStackTrace();
    }
  }
}

public class readDatabase {
  public static void main(String[] args){
    StudentThread t1 = new StudentThread();
    DepartmentThread t2 = new DepartmentThread();

    t1.start();
    t2.start();
  }
}
