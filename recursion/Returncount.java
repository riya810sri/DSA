// return the count of digits in a given number 

import java.util.Scanner;

public class Returncount {
    public static int countDigits(int n){
        int count=0;
         if (n == 0 || n==1|| n == 2 || n==3||n == 4 || n==5||n == 6 || n==7|| n==8 || n==9) {
            return 1;
        } else {
           
            count++;
             countDigits(n / 10);
           
            
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        int f=countDigits(n);
        System.out.println("count of digits "+n+" is: "+f);
        sc.close();

        
    }
}
