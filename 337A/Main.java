import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] f = new int[m];
        for(int i=0;i<m;i++){
            f[i]=sc.nextInt();
        }
        Arrays.sort(f);
        //When finding a Maximum, start at 0 (or MIN_VALUE).
        //When finding a Minimum, start at MAX_VALUE.
        int minDiff = Integer.MAX_VALUE;//Integer.MAX_VALUE is a constant in Java that represents the biggest possible number an integer can hold ($2,147,483,647$). It acts like "Infinity" for us.
        for(int i=0;i<=m-n;i++){
            int end = i + n-1;
            int diff = f[end]-f[i];
            if(diff < minDiff){
            minDiff = diff;
            }
        }
        System.out.println(minDiff);

    }
}