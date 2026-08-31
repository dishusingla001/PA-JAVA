public class waitingState {
  public static void main(String[] args)throws Exception{
    Thread main = Thread.currentThread();
    
    Runnable r1 = () -> {
      System.out.println("new thread");
      System.out.println(main.getState());
    };

    Thread t1 = new Thread(r1);
    t1.start();
    // t1.join();
    // t1.sleep(5000);
  }
}
