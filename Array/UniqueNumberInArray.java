import java.util.Scanner;

public class UniqueNumberInArray {
    public static int findUniqueNumber(int[] arr) {
        int n=arr.length;
        int ans=-1;
        for(int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++ ){
                if(arr[i] == arr[j]) {
                    arr[j] = -1; // Mark duplicate elements as -1
                    break; // No need to check further for this element
                }
            }
            }
            for(int k=0;k<n;k++){
                if(arr[k]>0){
                    ans= arr[k]; // Return the first positive number which is unique
                }
            }
            return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int uniqueNumber = findUniqueNumber(arr);
        System.out.println("The unique number in the array is: " + uniqueNumber);
        scanner.close();
    }
}
