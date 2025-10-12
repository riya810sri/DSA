import java.util.Scanner;

public class Returnmultiple {
    // by brute force

    public static int [] retrunMultiplesOfNum(int num ,int k){
        int [] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=num*(i+1);
            
        }
       return arr;
    }

    // by recursion

    public static void printMultiples(int num,int k){
        // base case 
        if(k==0){ 
            return;
        }

        // recursive work
        printMultiples(num, k-1); // 5,10,15...
       
        // self work
        System.out.println(num*k);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        System.out.print("enter value of k: ");
        int k=sc.nextInt();
        int [] arr=retrunMultiplesOfNum(n, k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        printMultiples(n, k);
        sc.close();
    }
}
