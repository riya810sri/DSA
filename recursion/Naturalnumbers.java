import java.util.Scanner;

public class Naturalnumbers {

     // write aprogram to print all natural numbers from 1 to n using recursion

    public static void printIncresing(int n){
       if(n==1){
        System.out.print(n+" ");
         return;
       }
       else{
         printIncresing(n-1);
        System.out.print(n+" ");
       }
    }
    
     // write aprogram to print all natural numbers from n to 1 using recursion
      
    public static void printDecreasing(int n){
        // base case
       if(n==1){
        System.out.print(n+" ");
         return;
       }
       else{
        
        // self work
        System.out.print(n+" ");


        // recursive work
        printDecreasing(n-1);
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        printIncresing(n);
        System.out.println();
        printDecreasing(n);
        sc.close();

    }
}
