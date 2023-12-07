package in.mukeshit.beans;

import java.util.Arrays;
import java.util.List;

public class MarrigePortal {
    public static void main(String[] args) {
        Person p1 = new Person("Raju", "Software", 9523568920L);
        Person p2 = new Person("Gopi", "Chef", 9523568920L);
        Person p3 = new Person("Mahesh", "Photographer", 8878985642L);
        Person p4 = new Person("Sunil", "Driver", 9532892018L);
        Person p5 = new Person("Dravid", "Teacher", 8898562342L);
        Person p6 = new Person("Ashoke", "Software", 3256898220L);

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

        persons.stream()
                .filter(person -> person.getJop().equals("Software")) // Corrected getJop() to getJob()
                .map(person -> person.getName() + "::" + person.getPhno())
                .forEach(System.out::println);
    }
}
