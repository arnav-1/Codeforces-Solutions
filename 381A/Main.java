import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int sum1=0;
        int sum2=0;
        int left=0;
        int right=n-1;
        boolean sturn = true;
        while(right>=left){
            int val = 0;
            if(arr[left]>arr[right]){
                val=arr[left];
                left++;
            }
            else{
                val=arr[right];
                right--;
            }

            if(sturn){
                sum1=sum1+val;
            }
            else{
                sum2=sum2+val;
            }
            sturn = !sturn;
        }
        System.out.print(sum1+" "+sum2);
    }
}