package Calculator;

public class ShoppingCart {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);
        double divResult = 0;
        try {
            divResult = calc.divide(15, 0);
        } catch (ArithmeticException err) {
            System.out.println("Error: Division by 0 is not allowed!!!\n" + err);
        }
        System.out.println("Division Result: " + divResult);

    }
}