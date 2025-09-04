import java.util.Scanner;
// Majority Element in an array
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        int result = findMajorityElement(arr, n);
        if(result != -1) {
            System.out.println("Majority Element is: " + result);
        } else {
            System.out.println("No Majority Element exists");
        }
        sc.close();
    }
public static int  findMajorityElement(int[] arr, int n){
    int count=1;
    int candidate=arr[0];
    for(int i=1;i<n;i++){
        if(count==0){
            candidate=arr[i];
            count=1;
        }
        if(arr[i]==candidate){
            count++;
        }else{
            count--;
        }
    }
    count=0;
    for(int val:arr){
        if(val==candidate){
            count++;
        }
    }
    if(count>n/2){
        return candidate;
    }else{
        return -1;
    }
}
}
