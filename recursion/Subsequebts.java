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

    // print without storing in arraylist 

     public static void returnSubseqent2(String s,String ans){
        if(s.length()==0){
              System.out.print(ans);
              return ;
        }
        char ch=s.charAt(0);

        // recursive work 
        String sc=s.substring(1);
         
        // current character not included
        returnSubseqent2(sc, ans);


        // current character included
        returnSubseqent2(sc, ans+ch);
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string: ");
        String s=sc.nextLine();
       ArrayList<String> list= returnSubseqent(s);
       for(String ss:list){
        System.out.print(ss);
       }
       System.out.println();
       returnSubseqent2(s, " ");
       sc.close();
    }
}
