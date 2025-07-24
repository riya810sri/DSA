import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class containduplicate {
    // Function to check if the array contains duplicates
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            // If the number is already in the set, we found a duplicate
            if (seen.contains(num)) {
                return true;
            }
            // Otherwise, add the number to the set
            seen.add(num);
        }
        return false; // No duplicates found
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the values of element :");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(containsDuplicate(nums));
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
    
}
