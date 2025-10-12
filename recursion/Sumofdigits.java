import java.util.Scanner;

public class Sumofdigits {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        int f=sumOfDigits(n);
        System.out.println("sum of digits "+n+" is: "+f);
        sc.close();

    }
}
