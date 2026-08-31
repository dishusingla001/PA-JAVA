// lambda function 
// functional interface 

// create an interface 
interface Add{
  int add(int x,int y);
}

interface Square{
  int square(int x);
}

class sumFunction{
  // // normal function 
  // int sum(int x,int y){
  //   return x+y;
  // }

  public static void main(String[] args){
    Add addition = (a,b) -> a + b;
    Square sqt = x -> x*x;
    System.out.println(addition.add(4,5));
    System.out.println(sqt.square(4));
  }
}