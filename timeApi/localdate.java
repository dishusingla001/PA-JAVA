import java.time.*;

class localdate{
  public static void main(String[] args){
    LocalDate date = LocalDate.now();
    // LocalDate date = LocalDate.of(2025,04,8);
    // LocalDate date = LocalDate.now().plusDays(10);
    // LocalDate date = LocalDate.now().minusDays(10);
    // System.out.println(date.getDayOfWeek());

    System.out.println(date);


  }
}