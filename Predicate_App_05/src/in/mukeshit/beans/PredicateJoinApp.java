package in.mukeshit.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoinApp {
    public static void main(String[] args) {
        Person p1 = new Person("Raju", 21);
        Person p2 = new Person("Chetan", 23);
        Person p3 = new Person("Anil", 67);
        Person p4 = new Person("Gita", 14);
        Person p5 = new Person("Suchitra", 26);
        List<Person> persons = new ArrayList<>(List.of(p1, p2, p3, p4, p5)); // Corrected list creation
        Predicate<Person> ageLowerLimit = p -> p.getAge() >= 21;
        Predicate<Person> ageUpperLimit = p -> p.getAge() <= 64;
        
        for (Person p : persons) {
            Predicate<Person> predicate = ageLowerLimit.and(ageUpperLimit);
            boolean isEligibleForMarriage = predicate.test(p); // Corrected variable name
            if (isEligibleForMarriage) {
                System.out.println(p.getName());
            }
        }
    }
}
