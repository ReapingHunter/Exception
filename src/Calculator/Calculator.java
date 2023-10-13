package Calculator;

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) throws ArithmeticException{
        if(y == 0) {
            throw new ArithmeticException("Error: Division by zero is illegal!!!");
        }
        return x / y;
    }
}
