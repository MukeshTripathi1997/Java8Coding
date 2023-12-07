package in.mukeshit.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringMappingDemo {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Anushka");
		list.add("Trisha");
		list.add("Nayantara");
		list.add("Deepika Padukone");
		list.add("Pooja Hegde");
		list.add("Amisha Patel");
		Stream<String> stream = list.stream();
		 stream.filter(name ->name.startsWith("A"))
		 .map(name -> name+": :"+name.length())
		 .forEach(System.out::println);
		
	}

}
