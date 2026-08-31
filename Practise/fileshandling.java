import java.io.*;

class fileshandling{
  public static void main(String[] args) throws Exception{
    File f = new File("abc.txt");
    File dir = new File("Folder1");
    System.out.println(f.exists());
    f.createNewFile();
    dir.mkdir();

    String[] list = dir.list();
    System.out.println(list);
  }
}