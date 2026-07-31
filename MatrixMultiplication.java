import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows=sc.nextInt();

        System.out.print("Enter columns: ");
        int cols=sc.nextInt();

        int[][] a=new int[rows][cols];
        int[][] b=new int[cols][rows];
        int[][] c=new int[rows][rows];

        System.out.println("Enter first matrix:");
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                a[i][j]=sc.nextInt();

        System.out.println("Enter second matrix:");
        for(int i=0;i<cols;i++)
            for(int j=0;j<rows;j++)
                b[i][j]=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                c[i][j]=0;
                for(int k=0;k<cols;k++)
                    c[i][j]+=a[i][k]*b[k][j];
            }
        }

        System.out.println("Product Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++)
                System.out.print(c[i][j]+" ");
            System.out.println();
        }
    }
}