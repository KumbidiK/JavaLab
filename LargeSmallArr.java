import java.util.Scanner;

public class LargestSmallest {
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

        int max=a[0][0];
        int min=a[0][0];

        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++){
                if(a[i][j]>max)
                    max=a[i][j];
                if(a[i][j]<min)
                    min=a[i][j];
            }

        System.out.println("Largest = "+max);
        System.out.println("Smallest = "+min);
    }
}