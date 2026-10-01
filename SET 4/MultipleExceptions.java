import java.util.Scanner;

class MultipleExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 0, 40, 50};

        System.out.print("Enter array index: ");
        int index = sc.nextInt();

        try {
            int value = numbers[index];

            System.out.println("Value = " + value);
            System.out.println("Result = " + (100 / value));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Exception handling completed");
        }
    }
}
