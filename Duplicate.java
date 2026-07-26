import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < 5; i++) {
            boolean printed = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    printed = true;
                    break;
                }
            }

            if (printed)
                continue;

            for (int j = i + 1; j < 5; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
