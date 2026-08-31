import java.util.*;
import java.util.function.Predicate;

class charLetterDigit {
    public static void main(String[] args) {

        // Whether a char is digit or letter or not using functional interface

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        Predicate<Character> check =
                c -> Character.isLetter(c) || Character.isDigit(c);

        System.out.println(check.test(ch));
    }
}