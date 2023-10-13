package Calculator;

public class ExceptionEx1 {

    public static void main(String args[]) {

        int[] nums = {3, 2, 6, 1};
        badUse(nums);
    }

    public static void badUse(int[] vals) {
        int total = 0;

        for (int i = 0; i < vals.length; i++) {
            try {
                int index = vals[i];
                total += vals[index];
                
            } catch(ArrayIndexOutOfBoundsException err) {
                System.out.println("Error: "+ err.getMessage() + ", accessing an index that does not exist.");
            } catch(Exception err) {
                System.out.println(err.getMessage());
            }
        }
         System.out.println(total);
    }
}
