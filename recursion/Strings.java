import java.util.Scanner;

public class Strings {

    // remove all the occurrence of a from the string ex- s="abcax" o/p - bcx
    
    public static String removeA(String s){
        if(s.length()==0){
            return "";
        }
        char ch=s.charAt(0);
        String ans=removeA(s.substring(1));
        if(ch=='a'){
            return ans;
        }else{
            return ch+ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println(n);
        // PRINTING CHARACTER OF WHOLE STRING 
        for(int i=0;i<n.length();i++){
            System.out.print(n.charAt(i)+" ");
        }
         System.out.println();
        // SUBSTRING METHOD
         
        System.out.println(n.substring(
            2, 5));
        
        String ans=removeA(n);
        System.out.println(ans);

        sc.close();
    }
}
