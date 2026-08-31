interface Operations{
  int calculate(int x,int y);
}

public class Main {
  public static int calc(int x,int y,Operations op){
    return op.calculate(x,y);
  }
  public static void main(String[] args){
    Operations add = (x,y)->x+y;
    Operations Sub = (x,y)->x-y;
    Operations mul = (x,y)->x*y;
    Operations div = (x,y)->x/y;

    System.out.println(calc(5,2,mul));
  }  
}
