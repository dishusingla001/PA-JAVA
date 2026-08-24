
public class Main {
  public static void main(String[] args){
    // with this we can set the name of the thread 
    Thread.currentThread().setName("abc");
    // print the name of the thread which we are using 
    System.out.println(Thread.currentThread().getName());

    // if we want to sleep the current thread 
    
    try{
      Thread.currentThread().sleep(5000);
    }catch(Exception e){

    }
    System.out.println(Thread.currentThread().getName());
  }
}
