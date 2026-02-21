import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int moves = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int value = sc.nextInt();
                
                if (value == 1) {
                    moves = Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }
        
        System.out.println(moves);
    }
}