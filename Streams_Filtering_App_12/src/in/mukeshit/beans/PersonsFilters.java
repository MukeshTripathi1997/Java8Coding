package in.mukeshit.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PersonsFilters {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person(28, "Raju", "software");
        Person p2 = new Person(29, "Mahesh", "Driver");
        Person p3 = new Person(30, "Ashoke", "Teacher");
        Person p4 = new Person(27, "Sunil", "Mechanic");
        Person p5 = new Person(30, "Bharat", "Chef");
        persons = Arrays.asList(p1, p2, p3, p4, p5);
        Stream<Person> stream = persons.stream();
        Stream<Person> filter = stream.filter(p -> p.getAge() > 21 && p.getAge() < 30);
        filter.forEach(System.out::println);
    }
}
