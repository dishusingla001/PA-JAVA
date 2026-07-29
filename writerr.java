import java.io.*;

public class writerr{
  public static void main(String[] args) throws 
  Exception {
    // how to write in the file with help of filewriter 
    FileWriter fr = new FileWriter("abc.txt");
    // char[] ch = {'a','b','c','d'};

    // fr.write(65) // write the char 
    // fr.write("Chitkara") // write the string
    // fr.write("Chitkara",0,4); // write the substring of any string
    
    // fr.close();


    // // how to write in the file with the help of the bufferWriter
    // BufferedWriter br = new BufferedWriter(fr);
    // br.write("Chitkara");
    // br.newLine();
    // br.write("University");

    // br.close();

    // copy the data from one file to another 
    // read the data 
    try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        br.write(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}