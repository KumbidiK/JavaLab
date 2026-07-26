import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] merge = new int[10];

        System.out.println("Enter 5 elements of first array:");
        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter 5 elements of second array:");
        for (int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            merge[i] = arr1[i];
        }

        for (int i = 0; i < 5; i++) {
            merge[i + 5] = arr2[i];
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < 10; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
