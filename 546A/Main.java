import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int borrow,sum=0;
        //arithemetic progression 
        //sum=k+2k+3k+4k....wk so k(1+2+3+4+...w) and (1+2+3+4+...w)=w(w+1)/2
        sum = k* (w*(w+1)/2);
        if(sum<=n) System.out.println(0);
    
        else    System.out.println(sum-n);   
    }
}