import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt=1;
        int streak=1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int n1,n2;
        for(int i=1;i<n;i++){
            n1=arr[i-1];
            n2=arr[i];
            if(n1<=n2){
                cnt++;
                if(cnt>streak){
                    streak=cnt;
                }
            }
            else{
                cnt=1;
            }
            
        }
        System.out.println(streak);
    }
}