package in.mukeshit.beans;

import java.util.function.Predicate;

public class NamesPrinting {
	public static void main(String[] args) {
		String[] names= {"kajal","Samantha","Anushka",	"Trisha","Anupma","Nayantara","Aishwarya"};
	Predicate<String> predicate=	name ->name.startsWith("A");
for(String name :names) {
	if(predicate.test(name)) {
		System.out.println(name);
		
	}
}
		
	}

}
