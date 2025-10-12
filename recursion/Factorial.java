import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
         int f;
        if(n==0){
            return 1;
        }
        else{
            f=n*factorial(n-1);
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number whose fractorial have to be calculate: ");
        int n=sc.nextInt();
        int f=factorial(n);
        System.out.println("Factorial of given number "+n+" is: "+f);
        sc.close();
    }
}
