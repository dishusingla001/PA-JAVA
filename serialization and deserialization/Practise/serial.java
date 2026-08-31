class serial{
  public static void main(String[] args){
    FileOutputStream fos = new FileOutputStream("abc.ser");
    ObjectOutputStream ous = new ObjectOutputStream(fos);

    ous.writeObject(obj);
  }
}