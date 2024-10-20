import java.util.Scanner;

public class CheckRotatedSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Array size should be at least 1.");
            sc.close();
            return;
        }

        int[] nums = new int[n];

    
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        boolean result = isSortedAndRotated(nums);

   
        if (result) {
            System.out.println("The array is sorted and rotated.");
        } else {
            System.out.println("The array is not sorted and rotated.");
        }

        sc.close();
    }

    
    private static boolean isSortedAndRotated(int[] nums) {
        int countBreaks = 0;
        int n = nums.length;

      
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                countBreaks++;
            }
        }

      
        return countBreaks <= 1;
    }
}

