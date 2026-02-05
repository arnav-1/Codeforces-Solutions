import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            value[i]=sc.nextInt();
            sum=sum+value[i];
        }
        Arrays.sort(value);
        int larger=(sum/2)+1;
        int count=0;
        int mysum=0;
        for(int i=n-1;i>=0;i--){
            mysum=mysum+value[i];
            count++;
                if(mysum>=larger){
                    System.out.println(count);
                    break;
                }

        }
    }

}