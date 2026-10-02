import java.util.Scanner;

public class SumRow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows=sc.nextInt();

        System.out.print("Enter columns: ");
        int cols=sc.nextInt();

        int[][] a=new int[rows][cols];

        System.out.println("Enter elements:");
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                a[i][j]=sc.nextInt();

        for(int i=0;i<rows;i++){
            int sum=0;
            for(int j=0;j<cols;j++)
                sum+=a[i][j];

            System.out.println("Row "+(i+1)+" Sum = "+sum);
        }
    }
}