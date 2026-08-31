interface I{
  int sum(int x,int y);
}

public class Main {
  static int sum(int x,int y){
    return x+y;
  }
  public static void main(String[] args){
    I i = Main::sum;
    System.out.println(i.sum(5,2));    
   }
}
