import java.io.*;

public class streams{
  public static void main(String[] args)throws Exception{
    // copy the image 
    // FileInputStream fis = new FileInputStream("photo1.jpg");
    // FileOutputStream ous = new FileOutputStream("photo2.jpg",true);


    // int x;

    // while((x = fis.read()) != -1){
    //   ous.write(x);
    // }

    // fis.close();
    // ous.close();

    // copy the image with the help of buffered stream
    BufferedInputStream bis = new BufferedInputStream( new FileInputStream("photo1.jpg"));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("photo3.jpg")
);

    int y; 

    byte[] buffer = new byte[4096];
    int bytesRead;
    
    while((bytesRead=bis.read(buffer))!=-1){
      bos.write(buffer,0,bytesRead);
    }

    bis.close();
    bos.close();

    System.out.println("File write SuccessFully");
  }
}