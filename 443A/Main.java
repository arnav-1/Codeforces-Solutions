import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        HashSet<Character> distinctLetters = new HashSet<>();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                distinctLetters.add(ch);
            }
        }
        
        System.out.println(distinctLetters.size());
        
        sc.close();
    }
}