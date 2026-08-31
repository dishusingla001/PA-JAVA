import java.io.*;

class writeFile{
  public static void main(String[] args) throws Exception{
    FileWriter fw = new FileWriter("abc.txt",true);

    fw.write(" is best");

    fw.flush();
    fw.close();
  }
}