package in.mukeshit.beans;

import java.util.stream.Stream;

public class NumbersFilter {
public static void main(String[] args) {
Stream<Integer>	stream=Stream.of(4,8,12,6,7,11,24);
//stream.forEach(System.out::println);
/*
 * stream.filter(i -> i>=6) .forEach(i ->System.out.println(i));
 */
stream.filter(i -> i>=20 )
.forEach(System.out::println);
	
}

}
