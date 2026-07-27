import java.util.Scanner;

public class Array2D {
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int arr[][] = new int[10][10];
                System.out.println("Enter no.of rows and column: ");
                int r = sc.nextInt();
                int c = sc.nextInt();
                System.out.println("Enter the 2D array: ");
                for(int i=0;i<r;i++){
                        for(int j=0;j<c;j++){
                                 arr[i][j] = sc.nextInt();
                        }
                }
                System.out.println("2D Array is :");
                for(int i=0;i<r;i++){
                        for(int j=0;j<c;j++){
                                System.out.print(arr[i][j]+"\t");
                        }
                        System.out.println();
                }
        }
}
