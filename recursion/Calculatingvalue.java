import java.util.Scanner;
// given two numbers p and q find the value p**q using a recursive function 

public class Calculatingvalue {
    public static int exponatial(int p,int q){
        int f;
        if(q==0){
            return 1;
        }else{
          f=exponatial(p, q-1)*p;
        return f;
        }
    }

 // given two numbers p and when q is even find the value p**q using a recursive function
  
 public static int exponatialEven(int p,int q){
        int f=0;
        if(q==0){
            return 1;
        }else
        {if(q%2==0){
          f=exponatial(p, q/2);
        }
        return f;  
    }
   
 } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        int f=exponatial(n,n);
        System.out.println("p ki power q "+n+" is: "+f);
        int f1=exponatialEven(n, n);
         System.out.println("p ki power q when q is even "+n+" is: "+f1);
        sc.close();

    }
}
