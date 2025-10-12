import java.util.Scanner;

public class Targetexist {
    public static Boolean targetComparision(int [] arr,int target,int idx){
        // base case
       if(idx==arr.length){
         return false;
       }
           // self work
           if(arr[idx]==target)
            return true;
           // recursive work
            return targetComparision(arr, target, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,4,5,3,7,8,54,34,67};
        System.out.print("enter a target: ");
        int n=sc.nextInt();
        int idx=0;
        if(targetComparision(arr, n, idx)){
            System.out.println("Target is found ");
        }else{
            System.out.println("target is not in array ");
        }
        sc.close(); 
    }
}
