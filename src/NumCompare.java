import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userA = 0;
        int userB = 0;
        String invalidInput = "";

        System.out.print("Please enter the first number User A: ");
        userA = in.nextInt();
        in.nextLine();

        System.out.print("Please ener the second number User B: ");
        userB = in.nextInt();
        in.nextLine();

        if( userA > userB){
            System.out.println("User A's number is larger than User B's number!");
        }
        else if(userA < userB){
            System.out.println("User B's number is Larger than User A's number!");
        }
        else if(userA == userB){
            System.out.println("User A's number is equal to User B's number!");
        }
        else {
            invalidInput = in.nextLine();
            System.out.println("You must enter a valid number not: " + invalidInput);
            System.out.println("Run the program again!");
        }



    }
}