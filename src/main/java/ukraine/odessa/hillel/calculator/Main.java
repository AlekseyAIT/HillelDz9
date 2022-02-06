package ukraine.odessa.hillel.calculator;

public class Main {
    @MainMethod
    public static void main(String[] args) {
        System.out.println("Hooray! Main class is working!");
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
    }
}
