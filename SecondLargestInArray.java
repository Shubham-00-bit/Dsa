import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

       
        if (n < 1) {
            System.out.println("Array size should be at least 1.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("The second largest element does not exist.");
            System.out.println(-1);
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        sc.close();
    }
}


