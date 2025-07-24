

public class marks {
    public static void main(String[] args) {
        // Creating an Array (method 1) - with new keyword
        int arr[] = {20, 39,35, 30, 45, 69, 80, 23, 100};
        System.out.println("roll number of fail students:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <35) {
                System.out.println(i);
    }
    else{
        continue;
    }
}
    }
}
