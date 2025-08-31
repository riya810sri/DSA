// find any pair exist in list whose sum is equal to target number
import java.util.ArrayList;

public class PairTwo {
    public static Boolean pairSum2(ArrayList<Integer> list, int n){
      int bp=-1; //breaking  point
      int n1=list.size();
      for(int i=0; i<list.size();i++){
        if(list.get(i)>list.get(i+1)){
            bp=i; // breaking point condition 
            break;
        }
      }

      int lp=bp+1; //smallest value
      int rp=bp; //largest 
      while (lp!=rp){
        //case 1
        if(list.get(lp)+list.get(rp)==n){
            return true;
          }//case 2
          if(list.get(lp)+list.get(rp)<n){
            lp=(lp+1)%n1;
          }else //case 3
          {
            rp=(n1+rp-1)%n;
          }
      }
      return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // arraylist is sorted as well as rotated
        list.add(11);
        list.add(15);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(8);
        int n=16;
        System.out.println(pairSum2(list, n));
    }
}
