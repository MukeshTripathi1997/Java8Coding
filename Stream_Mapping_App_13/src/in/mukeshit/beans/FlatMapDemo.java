package in.mukeshit.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> javacourses = Arrays.asList("Core Java", "Adv Java", "SBMS", "JRTP");
        List<String> uicourses = Arrays.asList("HTML5", "CSS3", "Angular", "React JS");
        List<String> cloudcourses = Arrays.asList("DevOps", "AWS", "Azure", "GCP");

        List<List<String>> fullcourses = Arrays.asList(javacourses, uicourses, cloudcourses);
        Stream<List<String>> stream1 = fullcourses.stream(); // Added space between <String> and stream1
        Stream<String> courses = stream1.flatMap(s -> s.stream());
        courses.forEach(System.out::println);
    }
}
