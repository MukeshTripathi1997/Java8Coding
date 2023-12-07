package in.mukeshit.beans;

import java.util.function.Predicate;

public class EvenCheck {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (i) -> i % 2 == 0;
        boolean status = isEven(predicate, 10);
        System.out.println(status);
        System.out.println(predicate.test(10));
    }

    public static boolean isEven(Predicate<Integer> predicate, Integer number) {
        return predicate.test(number);
    }
}
