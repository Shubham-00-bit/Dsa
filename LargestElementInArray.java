import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

      
        if (n < 1 || n > 1000000) {
            System.out.println("Array size out of bounds.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
            if (arr[i] < 0 || arr[i] > 1000000) {
                System.out.println("Array element out of bounds.");
                sc.close();
                return;
            }
        }

        
        int maxElement = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        
        System.out.println("The largest element in the array is: " + maxElement);

        sc.close();
    }
}

