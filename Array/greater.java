import java.util.Scanner;

public class greater  {
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
       int count=0;
       for(int i=0;i<size;i++){
            if(arr2[i]>x){
                count++;
            }
        }
        System.out.println("the count of numbers greater than "+x+" is:  "+count);
        sc.close();
    }
}
