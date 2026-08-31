public class Main {
  public static void main(String[] args)throws Exception{
    Runnable r1 = () -> {
      System.out.println("new thread");
    };

    Thread t1 = new Thread(r1);
    System.out.println(t1.getState());
    t1.start();
    System.out.println(t1.getState());
    t1.join();
    System.out.println(t1.getState());
    System.out.println("main Thread");
  }
}
