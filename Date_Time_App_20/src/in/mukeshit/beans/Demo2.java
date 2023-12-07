package in.mukeshit.beans;

import java.time.LocalTime;

public class Demo2 {
	public static void main(String[] args) {
			LocalTime time=LocalTime.now();		
			System.out.println(time);
			time =LocalTime.of(11, 20,03);
			System.out.println(time);
			time =LocalTime.parse("08:30:20");
			System.out.println(time);
			time =time.plusSeconds(4);
			System.out.println(time);
			time =time.plusMinutes(4);
			System.out.println(time);
			time =time.plusHours(2);
			System.out.println(time);
					}

}
