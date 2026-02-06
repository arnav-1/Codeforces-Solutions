import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int a,b,c,d;

        for(int i=0;i<t;i++){
            a= sc.nextInt();
            b= sc.nextInt();
            c= sc.nextInt();
            d= sc.nextInt();

            if(a==b && b==c && c==d)    System.out.println("YES");
            else    System.out.println("NO");
        }

    }
}