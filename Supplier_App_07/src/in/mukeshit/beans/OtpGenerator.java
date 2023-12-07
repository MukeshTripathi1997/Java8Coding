package in.mukeshit.beans;

import java.util.function.Supplier;

public class OtpGenerator {
    public static void main(String[] args) {
        StringBuilder otp = new StringBuilder(); // Use StringBuilder for mutability
        Supplier<String> s = () -> {
            for (int i = 1; i <= 6; i++) {
                otp.append((int) (Math.random() * 10)); // Append to StringBuilder
            }
            return otp.toString(); // Convert StringBuilder to String
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
