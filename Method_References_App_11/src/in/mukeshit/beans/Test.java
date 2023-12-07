package in.mukeshit.beans;

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

public class Test {
    public static void main(String[] args) {
        MyFunctionalInterface obj = () -> System.out.println("This is the m1() method");
        obj.myMethod();
    }
}
