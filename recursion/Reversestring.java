import java.util.Scanner;

public class Reversestring {
    // wap to print of a string using recursion 

    public static String reverseString(String s){
         if(s.length()==0){
            return "";
        }
        char ch=s.charAt(0);
        String ans=reverseString(s.substring(1));
        
        return ans+ch;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println(n);
        String ans=reverseString(n);
        System.out.println(ans);
        sc.close();
    }
}
       