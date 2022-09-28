
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean play = true;
        String answer = "";
        String P1 = "";
        String P2 = "";
        while (play) {
            Scanner in = new Scanner(System.in);
            System.out.println("Player 1 Input rock,paper, or scissors using capital R P or S  ");
            P1 = in.next();
            if (P1.equals("R")) {
                Scanner in2 = new Scanner(System.in);
                System.out.println("Player 2 Input rock,paper, or scissors using capital R P or S  ");
                P2 = in2.next();
                if (P2.equals("R")) {

                } else if (P2.equals("P")) {

                } else if (P2.equals("S")) {

                } else {

                    System.out.println("Invalid input");
                }
            } else if (P1.equals("P")) {
                Scanner in2 = new Scanner(System.in);
                System.out.println("Player 2 Input rock,paper, or scissors using capital R P or S  ");
                P2 = in2.next();
                if (P2.equals("R")) {

                } else if (P2.equals("P")) {

                } else if (P2.equals("S")) {

                } else {

                    System.out.println("Invalid input");
                }

            } else if (P1.equals("S")) {
                Scanner in2 = new Scanner(System.in);
                System.out.println("Player 2 Input rock,paper, or scissors using capital R P or S  ");
                P2 = in2.next();
                if (P2.equals("R")) {

                } else if (P2.equals("P")) {

                } else if (P2.equals("S")) {

                } else {

                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid input");

            }
            if (P1.equals("R") && P2.equals("R")) {
                System.out.println("Tie!");
                System.out.println("Would you like to play again?");
                Scanner in3 = new Scanner(System.in);
                System.out.println("Please input [Y/N]");
                answer = in3.next();
                if (answer.equals("Y")) {

                } else if (answer.equals("N")) {
                    play = false;
                } else {
                    System.out.println("invalid input");
                    play = false;
                }

            } else if (P1.equals("R") && P2.equals("S")) {
                System.out.println("Player 1 wins!");
                System.out.println("Would you like to play again?");
                Scanner in4 = new Scanner(System.in);
                System.out.println("Please input [Y/N]");
                answer = in4.next();
                if (answer.equals("Y")) {

                } else if (answer.equals("N")) {
                    play = false;
                } else {
                    System.out.println("invalid input");
                    play = false;
                }
            }
            else if (P1.equals("R") && P2.equals("P"))
            {
                System.out.println("Player 2 wins!");
                System.out.println("Would you like to play again?");
                Scanner in4 = new Scanner(System.in);
                System.out.println("Please input [Y/N]");
                answer = in4.next();
                if (answer.equals("Y")) {

                }
                else if (answer.equals("N"))
                {
                    play = false;
                } else {
                    System.out.println("invalid input");
                    play = false;
                }

            }
            else if (P1.equals("P") && P2.equals("P"))
            {
                System.out.println("It's a tie!");
                System.out.println("Would you like to play again?");
                Scanner in4 = new Scanner(System.in);
                System.out.println("Please input [Y/N]");
                answer = in4.next();
                if (answer.equals("Y")) {

                } else if (answer.equals("N")) {
                    play = false;
                } else {
                    System.out.println("invalid input");
                    play = false;
                }
            }
            else if (P1.equals("S") && P2.equals("S"))
            {
                System.out.println("It's a tie!");
                System.out.println("Would you like to play again?");
                Scanner in4 = new Scanner(System.in);
                System.out.println("Please input [Y/N]");
                answer = in4.next();
                if (answer.equals("Y")) {

                } else if (answer.equals("N")) {
                    play = false;
                } else {
                    System.out.println("invalid input");
                    play = false;
                }
            }
            else if (P1.equals("S") && P2.equals("R"))
            {
                System.out.println("Player 2 wins!");
                System.out.println("Would you like to play again?");
                Scanner in4 = new Scanner(System.in);
                System.out.println("Please input [Y/N]");
                answer = in4.next();
                if (answer.equals("Y")) {

                } else if (answer.equals("N")) {
                    play = false;
                } else {
                    System.out.println("invalid input");
                    play = false;
                }
            }
            else if (P1.equals("S") && P2.equals("P"))
            {
                System.out.println("Player 1 wins!");
                System.out.println("Would you like to play again?");
                Scanner in4 = new Scanner(System.in);
                System.out.println("Please input [Y/N]");
                answer = in4.next();
                if (answer.equals("Y")) {

                } else if (answer.equals("N")) {
                    play = false;
                } else {
                    System.out.println("invalid input");
                    play = false;
                }
            }
            else if (P1.equals("P") && P2.equals("S"))
            {
                System.out.println("Player 2 wins!");
                System.out.println("Would you like to play again?");
                Scanner in4 = new Scanner(System.in);
                System.out.println("Please input [Y/N]");
                answer = in4.next();
                if (answer.equals("Y")) {

                } else if (answer.equals("N")) {
                    play = false;
                } else {
                    System.out.println("invalid input");
                    play = false;
                }
            }
            else if (P1.equals("P") && P2.equals("R"))
            {
                System.out.println("Player 1 wins!");
                System.out.println("Would you like to play again?");
                Scanner in4 = new Scanner(System.in);
                System.out.println("Please input [Y/N]");
                answer = in4.next();
                if (answer.equals("Y")) {

                } else if (answer.equals("N")) {
                    play = false;
                } else {
                    System.out.println("invalid input");
                    play = false;
                }
            }
        }
    }
}