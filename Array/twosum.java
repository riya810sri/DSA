import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        
    System.out.println();
        Scanner  sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
       int size=sc.nextInt();
       int arr2[]=new int[size];
       System.out.println("enter the value of array: ");
       for(int i=0;i<size;i++){
         arr2[i]=sc.nextInt();
       }
       System.out.print("enter the number: ");
       int x=sc.nextInt();
       
       for(int i=0;i<size;i++){
            for(int j=1;j<size;j++){
               if((arr2[i]+arr2[j])==x){
                System.out.println(arr2[i]+","+arr2[j]);
               }
            }
        }
        
        sc.close();
    }
}
