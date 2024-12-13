import java.util.Scanner;
/**
 * method writeLetterPerLine(String input) returns a String with each letter of input as a capital letter on a new line.
 * method writeInReverse(String input) returns a String with a reverse of input. (ex: Red becomes deR)
 *
 * @author Kailyn Lau
 */
public class PlayingWithWords
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your input.");
        String input = scan.next();
        System.out.println("Letter Per Line:");
        writeLetterPerLine(input);
        System.out.println("In Reverse:");
        writeInReverse(input);
    }
    
    public static void writeLetterPerLine(String input) {
        String answer = "";
        for (int i = 0; i < input.length(); i++) {
            answer = answer + String.valueOf(input.charAt(i)).toUpperCase() + "\n";
        }
        
        System.out.println(answer);
    }
    
    public static void writeInReverse(String input) {
        String answer = "";
        for (int i = input.length(); i > 0; i--) {
            answer = answer + String.valueOf(input.charAt(i - 1));
        }
        
        System.out.println(answer);
    }
}
