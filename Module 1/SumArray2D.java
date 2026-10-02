import java.util.Scanner;
public class SumArray2D {
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int arr[][] = new int[10][10];
                System.out.println("Enter no.of rows and columns : ");
                int r = sc.nextInt();
                int c = sc.nextInt();
                int sum = 0;
                System.out.println("Enter the 2D array :" );
                for(int i=0;i<r;i++)
                {
                        for(int j=0;j<c;j++)
                        {
                                arr[i][j] = sc.nextInt();
                                sum += arr[i][j];
                        }
                }
                System.out.println("2D array is: ");
                for(int i=0;i<r;i++)
                {
                        for(int j=0;j<c;j++)
                        {
                                System.out.print(arr[i][j]+"\t");
                        }
                        System.out.println();
                }
                System.out.println("Sum = "+sum);
        }
}

