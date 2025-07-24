public class passingarraymethod{
    public static void change(int [] arr){
        // x=7;
        arr[2]=32;

    }
    public static void main(String[] args) {
        int [] arr={20,21,12,23,43};
        change(arr);

        System.out.println(arr[2]);
    }
}