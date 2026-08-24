class MyThread implements Runnable{
  public void run(){
    System.out.println("thread created by interface");
  }
}

public class CreateThread2 {
    public static void main(String[] args){
      Thread t1 = new Thread(new MyThread());
      t1.start();
      System.out.println("Main Thread");
    }
}
