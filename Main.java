import java.io.*;

public class Main{
  public static void main(String[] args){
    // File folder = new File("Folder1");
    // File file = new File(folder,"abc.txt");
    // System.out.println(file.exists());
    // System.out.println(folder.exists()); 
    // System.out.println(file.isFile()); //  check file exist in the system or not 
    // System.out.println(folder.isDirectory()); // check folder exist in the system or not 
    // System.out.println(file.getAbsolutePath());
    // System.out.println(file.canRead());
    // System.out.println(file.canWrite());
    // System.out.println(file.length());

    // create file and folder 
    // try {
    //   System.out.println(file.createNewFile());
    // } catch (IOException e) {
    //   e.printStackTrace();
    // }

    // System.out.println(folder.mkdirs());
    // System.out.println(file.delete());
    // System.out.println(folder.delete());

    // System.out.println(file.createNewFile());

    // System.out.println(file.list());
    // System.out.println(file.listFiles());

    // read the data 
    // try (FileReader f = new FileReader("abc.txt")) {
    //   int ch;
    //   while ((ch = f.read()) != -1) {
    //     System.out.print((char) ch);
    //   }
    //   System.out.println();
    // } catch (IOException e) {
    //   e.printStackTrace();
    // }

    // read file with buffered reader
    try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}