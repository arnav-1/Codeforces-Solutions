import java.util.*;
import java.math.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }   
        Arrays.sort(arr);
        int sum=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0 && cnt<m ){
                sum=sum+Math.abs(arr[i]);
                cnt++;
            }
            else {
                break;
            }
            
        }
        System.out.print(sum);

    }
}