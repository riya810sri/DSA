import java.util.ArrayList;
import java.util.Scanner;
  // find any pair exist in list whose sum is equal to target number
public class Pair {

   // brute force approch o(n**2)

    public static Boolean pairSum(ArrayList<Integer> list, int n){
        //  ArrayList<Integer>  Pair=new ArrayList<>();
         for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==n){
                    // Pair.add(list.get(i));
                    // Pair.add(list.get(j));
                    return true;
                }
            }
         }
        return false;
    }

    // 2 pointer approch o(n)

    public static Boolean pairSum2(ArrayList<Integer> list, int n){
          int lp=0;
          int rp=list.size()-1;
          while (lp!=rp) {
            if(list.get(lp)+list.get(rp)==n){
            return true;
          }
          if(list.get(lp)+list.get(rp)<n){
            lp++;
          }else{
            rp--;
          }
          }
          return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(6);

        Scanner sc=new Scanner(System.in);
        System.out.print("enter target number: ");
        int n=sc.nextInt();
        System.out.println("by brute force: ");
        System.out.println(pairSum(list, n));
        System.out.println();
        System.out.println("by 2 pinter: ");
        System.out.println(pairSum2(list, n));
        sc.close();
    }
}
