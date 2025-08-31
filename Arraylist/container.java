import java.util.ArrayList;


public class container {

    // brute force approch  o(n**2)

    public static int storeWater(ArrayList<Integer> list){
        int maxwater=0;
        for(int i=0;i<list.size(); i++){
            for(int j=i+1; j<list.size();j++){
                int ht=Math.min(list.get(i), list.get(j));
                int width=j-i;
                int currwater=ht*width;
                maxwater=Math.max(maxwater, currwater);
            }
        
        }
        return maxwater;
    }

    // 2pointer approch o(n)

    public static int storewater2(ArrayList<Integer> list){
         int maxwater=0;
         int lp=0;
         int rp=list.size()-1;
         while (lp<rp) {
            int ht=Math.min(list.get(lp), list.get(rp));
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(maxwater, currwater);
            if(list.get(lp)<list.get(rp)){
                  lp++;
            }else{
                rp--;
            }
         }
         return maxwater;
    }

     public static void main(String[] args) {
        // for given n lines on x-axis , use 2 lines to form a container such that it holds maximum water
        
        ArrayList<Integer> list=new ArrayList<>();
       
           
            list.add(1);
            list.add(8);
            list.add(6);
             list.add(2); list.add(5); list.add(4); list.add(8); list.add(3); list.add(7); list.add(2);
          System.out.println("by brute froce approch: ");
          System.out.println(storeWater(list)+ " litre");
          System.out.println();
          System.out.println("by 2 pointer approch: ");
          System.out.println(storewater2(list)+" litre");
          System.out.println();
     
    }
}
