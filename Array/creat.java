import java.util.Scanner;
public class creat {
    public static void main(String[] args) {
        // Creating an Array (method 1) - with new keyword
        int arr[]={20,22,22,30};
        System.out.print("the given array: ");
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
        
        // Creating an Array (method 2) - with new keyword
        System.out.println();
        int arr1[]=new int[4];
        arr1[0]=10;
        arr1[1]=11;
        arr1[2]=45;
        arr1[3]=69;
        System.out.print("the given array: ");
        for(int i=0;i<4;i++){
            System.out.print(arr1[i]+" ");
        }

        // Taking an array as an input and printing its elements.
        
        System.out.println();
        Scanner  sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
       int size=sc.nextInt();
       int arr2[]=new int[size];
       System.out.print("enter the value of array: ");
       for(int i=0;i<size;i++){
         arr2[i]=sc.nextInt();
       }

       System.out.print("th given array is: ");
       for(int i=0;i<size;i++){
            System.out.print(arr2[i]+" ");
        }


        //Take an array of names as input from the user and print them on the screen.
        System.out.println();
        System.out.print("enter the size of array: ");
        int size1=sc.nextInt();
       String arr3[]=new String[size];
       System.out.print("enter the names in array: ");
       for(int i=0;i<size1;i++){
         arr3[i]=sc.next();
       }

       System.out.print("th given array is: ");
       for(int i=0;i<size;i++){
            System.out.print(arr3[i]+" ");
        }
       System.out.println();
        System.out.println("hello world");
        System.out.println("this is case");
        sc.close();
    }
    
}
