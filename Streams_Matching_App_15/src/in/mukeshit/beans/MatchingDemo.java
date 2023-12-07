package in.mukeshit.beans;

import java.util.ArrayList;
import java.util.List;

public class MatchingDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dravid", 23, "India"));
        list.add(new Person("Joy", 23, "USA"));
        list.add(new Person("Ryan", 50, "Canada"));
        list.add(new Person("Ram", 45, "India"));
        list.add(new Person("Ching", 56, "China"));

        // Uncomment the following block to check if Indians are available in the collection
        /*
        boolean isIndianAvailable = list.stream().anyMatch(p -> p.getCountry().equals("India"));
        System.out.println("Is Indians Available in the collection: " + isIndianAvailable);
        */
		/*
		 * boolean allMatch = list.stream().allMatch(p ->
		 * p.getCountry().equals("India"));
		 * System.out.println("All the persons are Indians or not: " + allMatch);
		 */
      boolean nonMatch=  list.stream().noneMatch(p ->p.getCountry().equals("Germany"));
      System.out.println("No German are availbale : : " + nonMatch);
    }
}

class Person {
    String name;
    int age;
    String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", country=" + country + "]";
    }
}
