import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        //char ch = str.charAt(index);
        //In Java we dont have \0 we use .length()
        int count=0;
        for(int i=1;i!=x.length();i++){
            char ch = x.charAt(i-1);
            char ch2= x.charAt(i);
            if(ch==ch2){
                count++;
                if(count==6){
                    System.out.println("YES");
                    break;//It stops the whole loop at once and goes to the next line after the }
                }
            }
            else    count=0;
        }
        if(count!=6)    System.out.println("NO");

    }
}