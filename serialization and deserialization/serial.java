import java.io.*;

class Student implements Serializable{
  private final static long serialVersionUID = 1L;
  int rn;
  String name;
  transient String password;  // it protect the sensitive data 

  Student(int rn , String name,String password){
    this.rn = rn;
    this.name = name;
    this.password = password;
  }

}

public class serial{
  public static void main(String[] args)throws Exception{
    Student s = new Student(1043,"Dishu","Dishu1043");

    FileOutputStream fos = new FileOutputStream("student.ser");
    ObjectOutputStream ous = new ObjectOutputStream(fos);

    ous.writeObject(s);

    ous.close();

    System.out.println("Object Serialized");
  }
}