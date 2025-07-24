import java.util.Scanner;

public class Maxi{
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
       int max=arr2[0];
       int secmax = arr2[1];
       for(int i=1;i<size;i++){
            if(arr2[i]>max){
                max=arr2[i];
            }
        }
        for(int i=0;i<size;i++){
            if(arr2[i]>secmax && arr2[i]<max){
                secmax=arr2[i];
            }
        }
        System.out.println("maximum value in array is: "+max);
        sc.close();
        System.out.println("second maximum value in array is: "+secmax);
    }
    
}