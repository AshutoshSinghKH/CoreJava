import java.util.Scanner;

class ass19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the character:");
        char ch = input.next().charAt(0);

        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" :
                        (ch >= 'a' && ch <= 'z') ? "Lowercase" :
                        "Not a letter";

        System.out.println("The character is: " + result);
}
}