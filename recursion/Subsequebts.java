import java.util.ArrayList;
import java.util.Scanner;

public class Subsequebts {
    public static ArrayList<String> returnSubseqent(String s){
        ArrayList<String> list=new ArrayList<>();
        if(s.length()==0){
           list.add(" ");
           return list;
        }
        char ch=s.charAt(0);

        // recursive work 
        ArrayList<String> ans=returnSubseqent(s.substring(1));

         for(String ss:ans){
            list.add(ss);
            list.add(ch+ss);
         }

        return list;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string: ");
        String s=sc.nextLine();
       ArrayList<String> list= returnSubseqent(s);
       for(String ss:list){
        System.out.print(ss);
       }
       sc.close();
    }
}
