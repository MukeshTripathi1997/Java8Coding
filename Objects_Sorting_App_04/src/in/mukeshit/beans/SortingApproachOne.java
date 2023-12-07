package in.mukeshit.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator; // Import Comparator interface
import java.util.List;

public class SortingApproachOne {
    public static void main(String[] args) {

        Person p1 = new Person(101, "Nick", "nick@ashokit.in");
        Person p2 = new Person(102, "Orlen", "orlen@ashokit.in");
        Person p3 = new Person(103, "John", "john@ashokit.in");
        Person p4 = new Person(104, "Charles", "charles@ashokit.in");
        List<Person> persons = Arrays.asList(p1, p2, p3, p4);
        System.out.println("======Objects Before Sorting=====");
        for (Person p : persons) {
            System.out.println(p);
        }

        Collections.sort(persons, new PersonComparator());
        System.out.println("====Objects After Sorting====");
        for (Person p : persons) {
            System.out.println(p);
        }

    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getPname().compareTo(p2.getPname());
    }
}
