import java.util.Scanner;

public class Returbindecesoftarget {
    public static int[] returnIndicesOfTarget(int[] arr, int target, int idx, int count) {
        // Base case
        if (idx == arr.length) {
            return new int[count]; // create array of size = number of matches or return empty array
        }

        // Recursive call
        if (arr[idx] == target) {
            int[] result = returnIndicesOfTarget(arr, target, idx + 1, count + 1);
            result[count] = idx; // store index at position 'count'
            return result;
        } else {
            return returnIndicesOfTarget(arr, target, idx + 1, count);
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,4,5,3,7,8,3,34,3};
        System.out.print("enter a target: ");
        int n=sc.nextInt();
        int [] ans =returnIndicesOfTarget(arr, n, 0,0);
        if(ans.length==0){
            System.out.println("No match found");
        }else{
            System.out.println("Match found at indices: ");
            for(int i:ans){
            System.out.print(i+" ");
        }
        }
        

        sc.close();
    }
}
