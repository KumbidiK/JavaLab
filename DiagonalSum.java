//write a program to find the sum of the principal and secondary diagonal elements of a square matrix

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n=sc.nextInt();

        int[][] a=new int[n][n];

        int principal=0;
        int secondary=0;

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();

        for(int i=0;i<n;i++){
            principal+=a[i][i];
            secondary+=a[i][n-1-i];
        }

        System.out.println("Principal Diagonal Sum = "+principal);
        System.out.println("Secondary Diagonal Sum = "+secondary);
    }
}
