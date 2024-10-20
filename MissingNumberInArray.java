import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of the array (n): ");
        int n = sc.nextInt();


        if (n < 1) {
            System.out.println("Array size should be at least 1.");
            sc.close();
            return;
        }

        int[] nums = new int[n];


        System.out.println("Enter " + n + " distinct numbers in the range [0, " + n + "]:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        int missingNumber = findMissingNumber(nums, n);


        System.out.println("The missing number is: " + missingNumber);

        sc.close();
    }


    private static int findMissingNumber(int[] nums, int n) {
    
        int expectedSum = n * (n + 1) / 2;

   
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }


        return expectedSum - actualSum;
    }
}

