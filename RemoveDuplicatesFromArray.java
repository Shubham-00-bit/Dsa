import java.util.Scanner;

public class RemoveDuplicatesFromArray {
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


        System.out.println("Enter the elements of the array in non-decreasing order:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        sc.close();
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

  
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k; 
    }
}

