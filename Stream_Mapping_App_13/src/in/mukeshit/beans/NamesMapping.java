package in.mukeshit.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesMapping {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Anushka");
		list.add("Trisha");
		list.add("Nayantara");
		list.add("Deepika Padukone");
		list.add("Pooja Hegde");
		list.add("Amisha Patel");
		Stream<String> stream = list.stream();
		stream.map(name -> name.toUpperCase())
		.forEach(System.out::println);
		
		
			
	}

}
