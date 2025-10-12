import java.util.Scanner;

public class Gcd {
    
    // by brute force approch

    public static int gcdHcf(int x,int y){
        int min=0;
        if(x<y){
            min=x;
        }else{
            min=y;
        }
        // time complexity o(min)
        for(int i=min;i>0;i--){
            if(x%i==0 && y%i==0){
                min=i;
                break;
            }
        }
       return min;
    }

    // by recursive force
   
     public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        else if(x==0){
            return y;
        }
        else{
          return gcd(y, x%y);
        }
     }


    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter a two number: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("GCD of " +x+" and "+y+" is:"+gcdHcf(x,y));
        System.out.println("GCD OF "+x+" and "+y+" by recursive is: "+gcd(x, y));
        sc.close();
    }
}
