import java.util.*;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();

        for(int i=0;i<k;i++){
            long val = n%10;
            if(val==0){
                n=n/10;
            }
            else{
                n=n-1;
            }
        }
        System.out.println(n);
    }
}