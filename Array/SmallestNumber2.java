import java.util.Scanner;
// Smallest number whose digits multiply to give n
public class SmallestNumber2 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solution(n));
        sc.close();
    }
    public static int solution(int n){
        String ans="";
        for(int i=9;i>=2;i--){
            while(n%i==0){
                n=n/i;
                ans=i+ans;
            }
        }
        if(n!=1){
            return -1;
        }else{
            return Integer.parseInt(ans);
        }
    }
    
}
