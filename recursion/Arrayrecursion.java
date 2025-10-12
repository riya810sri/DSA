public class Arrayrecursion {
    public static void printArray(int [] arr,int idex){
        // base case

       if(idex==arr.length){
        return;
       }else{

       // self work

       System.out.println(arr[idex]);

       //recursive call
       printArray(arr, idex +1);
         
       }
    }
    
    public static void main(String[] args) {
        int [] arr={5,6,7,8,9};

        printArray(arr,0);
    }
}
