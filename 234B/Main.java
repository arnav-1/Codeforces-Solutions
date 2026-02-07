import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int num,num2;
        for(int i=1;i<=k;i++){
            num = arr[i-1];
            num2 = arr[i];
            if(num != num2){
                
                break;
            }
        }

    }
}