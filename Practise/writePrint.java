import java.io.*;

class writePrint{
  public static void main(String[] args) throws Exception{
    FileWriter fw = new FileWriter("abc.txt",true);
    PrintWriter pw = new PrintWriter(fw);

    pw.println("I am an engineer");
    pw.print("Yes");

    pw.flush();
    pw.close();
  }
}