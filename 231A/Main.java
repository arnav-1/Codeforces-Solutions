import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int solvedCount = 0;
        
        for (int i = 0; i < n; i++) {
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();
            
            int sureCount = petya + vasya + tonya;
            if (sureCount >= 2) {
                solvedCount++;
            }
        }
        
        System.out.println(solvedCount);
    }
}