/**
 * Kailyn Lau - determine whether a user is eligible to vote
 */

public class Voting
{
    public static boolean isEligibleToVote(int currentYear, int birthYear, int birthMonth){
        if (currentYear - birthYear > 18) {
            return true;
        } else if ((currentYear - birthYear == 18) && (birthMonth < 11)) {
            return true;
        }
        return false;
    }
    
    public static void main (String[] args) {
        System.out.println(isEligibleToVote(2000, 2018, 1));
        System.out.println(isEligibleToVote(2000, 2018, 11));
        System.out.println(isEligibleToVote(2000, 2018, 12));
        System.out.println(isEligibleToVote(2001, 2018, 1));
        System.out.println(isEligibleToVote(1999, 2018, 1));
        System.out.println(isEligibleToVote(2000, 2024, 3));
        System.out.println(isEligibleToVote(2006, 2024, 10));
    }
}
