import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int width=0;
        for(int i=0;i<n;i++){
            if(A[i]>h)  width=width+2;
            else{
                width++;
            }
        }
        System.out.println(width);
    }
}