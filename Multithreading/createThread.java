
class MyThread extends Thread{
  public void run(){
    // System.out.println("thread started and name is " + Thread.currentThread().getName());

    try{
      Thread.currentThread().sleep(3000);
    }catch(Exception e){

    }

    for(int i=0;i<=5;i++){
      System.out.println("Dhoni "+i);
    }
  }
}
public class createThread {
  public static void main(String[] args){
    MyThread t1 = new MyThread();
    // there are multiple states of the threads 
    // above is the new state  

    System.out.println(t1.getState());
    
    t1.start();
    try{
      t1.join();
    }catch(Exception e){

    }

    // if we want that we did not want to run anything else 
    // now the execution is stop here till the above code is not completed 
    System.out.println(t1.getState()); // now the thread is runnable 

    for(int i=0;i<=5;i++){
      System.out.println("yuvraj "+i);
    }
  }
}
