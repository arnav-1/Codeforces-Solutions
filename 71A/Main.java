import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            String S = sc.next();
            if(S.length()>10){
            System.out.println(S.charAt(0) + "" + (S.length() - 2) + S.charAt(S.length() - 1));
            //The empty quotes "" are a trick to make sure Java treats this as text concatenation, not math addition
            }
            else{
                System.out.println(S);
            }
        }
    }
}
