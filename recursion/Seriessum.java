import java.util.Scanner;

public class Seriessum {

      // find the sum of natural numbers till n but with alternate signs

    public static int seriesSum(int n){
        if(n==0){
            return 0;
        }else{
            if(n%2==0){
            return seriesSum(n-1)-n;
            }else{
               return seriesSum(n-1)+n; 
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        System.out.println("sum of 1 to "+n+" :"+seriesSum(n));
        sc.close();
    }
}
