class Practise{
  int count;
  // synchronized void incCount(){
  //   count++;
  // }

  // -- another way 
  void incCount(){
    synchronized(this){
      count++;
    }
  }
}

public class Sync {
  public static void main(String[] args) throws Exception{
    Practise p = new Practise();
    Runnable r1 = () -> {
      for(int i=1;i<=10000;i++){
        p.incCount();
      }
    };

    Runnable r2 = () -> {
      for(int i=1;i<=10000;i++){
        p.incCount();
      }
    };

    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    t1.start();
    // t1.join();

    t2.start();

    t1.join();
    t2.join();

    System.out.println(p.count);
  }
}
