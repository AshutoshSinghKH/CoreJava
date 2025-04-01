import java.util.Scanner;

public class ass10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a character:");
        char ch = input.next().charAt(0);
        
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                         ? "Vowel" 
                         : "Consonant";
        
        System.out.println(ch + " is a " + result);
        
        
    }
}
