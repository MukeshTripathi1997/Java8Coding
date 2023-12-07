package in.mukeshit.beans;

public class WellWisher {
	public static void main(String[] args) {
		Greeting hindi = () -> System.out.println("Namaskar...!!!!");
		hindi.greet();
		Greeting english = () -> System.out.println("Hello,Good Morning...!!!!");
		english.greet();

	}
}