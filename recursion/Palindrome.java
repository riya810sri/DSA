import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s,int i,int j){
        // base case
        if(i>j){
            return true;
        }
        // self work
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }else{
            // recursive call
            return isPalindrome(s, i+1, j-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string: ");
        String n=sc.nextLine();
        int l=0;
        int r=n.length()-1;
        if(isPalindrome(n, l, r)){
            System.out.println("given string is palindrome ");
        }else{
            System.out.println("given string is not palindrome");
    }
    sc.close();
}
}