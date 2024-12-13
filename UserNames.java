import java.util.Random;
import java.util.Scanner;
/**
 * Produces user name, based on first and last names, and a random integer:
 * A user name consists of the user's first name initial, followed by
 * the first 5 letters of their last name, followed by a random two digit integer in the range [10-99]
 * It continues producing user names until the user chooses to stop the process.
 *
 * @author Kailyn Lau
 */

public class UserNames
{
    public static String produceFirstPart(String firstName, String lastName){
        String answer = "";
        try {
            answer = String.valueOf(firstName.charAt(0));
        } catch (Exception e) {
        }
        for (int i = 0; i < lastName.length() && i < 5; i++) {
            answer = answer + String.valueOf(lastName.charAt(i));
        }
        return answer.toLowerCase();
    }

    public static int produceSecondPart(){
        Random generator = new Random();
        return generator.nextInt(90) + 10;
    }

    public static String produceOneUserName(String firstName, String lastName){
        return produceFirstPart(firstName, lastName) + produceSecondPart();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Producing username.");
        System.out.print("Enter first name: ");
        String firstName = scan.next();
        System.out.print("Enter last name: ");
        String lastName = scan.next();
        boolean answer = true;
        while (answer) {
            System.out.println(produceOneUserName(firstName, lastName));
            System.out.println("Generate again? Type \"continue\".");
            if (scan.next().equalsIgnoreCase("continue")) {
                answer = true;
            } else {
                answer = false;
            }
        }
        scan.close();
    }
}

