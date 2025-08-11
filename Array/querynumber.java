import java.util.Scanner;

public class querynumber {
    static int [] makefrequencyArray(int [] arr) {
        int freq[] = new int[100005]; // Assuming numbers are in the range 0-1000
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq; // Return the frequency array
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the values of element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the query number:");
        int query=sc.nextInt();

        int [] freq=makefrequencyArray(arr);
        while (query >0) 
        {
            System.out.println("Enter the number to query:");
            int x=sc.nextInt();
            if(x >= 0 && x < freq.length && freq[x] > 0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            query--;
        }
        sc.close();
        
    }
}
 