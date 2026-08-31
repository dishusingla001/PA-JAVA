import java.io.*;

class appendfile{
  public static void main(String[] args){
    File f1 = new File("ab1.txt");
    File f2 = new File("ab2.txt");
    File f3 = new File("append.txt");

    try{

        FileReader fr1 = new FileReader(f1);
        FileReader fr2 = new FileReader(f2);
        
        FileWriter fw = new FileWriter(f3,true);
        
        int i;
        
        while((i=fr1.read())!=-1){
            fw.write((char)i);
        }
        
        while((i=fr2.read())!=-1){
            fw.write((char)i);
        }

        fw.flush();
        fr1.close();
        fr2.close();
        fw.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
  }
}