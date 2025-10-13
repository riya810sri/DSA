import java.util.Scanner;

public class Sumofsubsets {
    public static int[] sumOfAllSubsets(int [] arr,int n,int idx,int currsum){
          
        if(idx==n){
            int [] base=new int[1];
            base[0]=currsum;
            return base ;
        }
        // curridx +curr sum
        int [] left=sumOfAllSubsets(arr, n, idx+1, currsum+arr[idx]);



        // curridx - curr sum
        int [] right=sumOfAllSubsets(arr, n, idx+1, currsum);

        return merge(left, right);

        }
       
        public static int[] merge(int [] left,int [] right){
            int [] result=new int[left.length+right.length];
            int k=0;
            for(int i=0;i<left.length;i++){
                result[k]=left[i];
                k++;
            }
            for(int j=0;j<right.length;j++){
                result[k]=right[j];
                k++;
            }
            return result;
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] result=sumOfAllSubsets(arr, n, 0,0);
        System.out.println("Sum of all subsets are: ");
        for(int s:result){
            System.out.print(s+" ");
        }
        sc.close();
    }

}