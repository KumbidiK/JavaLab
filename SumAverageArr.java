import java.util.Scanner;
public class SumAverageArr{
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int arr[] = new int[5];
                System.out.println("Enter 5 elements of the array: ");
                for(int i=0;i<5;i++)
                        arr[i] = sc.nextInt();
                int sum = 0;
                for(int i=0;i<5;i++)
                        sum+=arr[i];
                float avg = sum/5;
                System.out.println("Sum = "+sum+" Average = "+avg);
        }
}
~   
