import java.io.*;

public class deserial{
  public static void main(String[] args)throws Exception{
    // Student s = new Student(1043,"Dishu");

    FileInputStream fis = new FileInputStream("student.ser");
    ObjectInputStream ois = new ObjectInputStream(fis);

    Student s = (Student)ois.readObject();

    ois.close();

    System.out.println(s.rn);
    System.out.println(s.name);
    System.out.println(s.password);
  }
}