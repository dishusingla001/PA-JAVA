import java.time.*;

class localDatetime{
  public static void main(String[] args){
    // LocalDateTime time = LocalDateTime.now();
    // LocalTime time = LocalTime.of(12,12,12);
    // LocalTime time = LocalTime.now();
    // System.out.println(time.plusHours(10));

    // System.out.println(time);

    // ZonedDateTime zdt = ZonedDateTime.now();
    // ZonedDateTime zdt = ZonedDateTime.withZoneSameInstant();
    // System.out.println(zdt);

    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String s = LocalDate.now().format(f);
    System.out.println(s);
  }
}