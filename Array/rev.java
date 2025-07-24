import java.util.Scanner;

public class rev {
    public static void swap(int []arr2,int i,int j){
        int temp;
       temp=arr2[i];
               arr2[i]=arr2[j];
               arr2[j]=temp;
    }
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
       int size=sc.nextInt();
       int arr2[]=new int[size];
       System.out.println("enter the value of array: ");
       for(int i=0;i<size;i++){
         arr2[i]=sc.nextInt();
       }
       
       
       
        int i=0;
        int j=size-1;
        while(i<j){
               swap(arr2, i, j);
               i++;
               j--;

        }
               
            
        System.out.print("the reverse array is: ");
        for(int k=0;k<size;k++){
            System.out.print(arr2[i]+" ");
        }

        
        sc.close();
    }
}
