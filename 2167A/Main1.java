import java.util.*;
public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int a,b,c,d;

        for(int i=0;i<=t;i++){
            a= sc.nextInt();
            b= sc.nextInt();
            c= sc.nextInt();
            d= sc.nextInt();
                if(a*4==a+b+c+d)    System.out.println("YES");
                //Very bad logic 40 = 10+8+12+10
                else    System.out.println("NO");
        }

    }
}