import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int die1;
        int die2;
        boolean done1 = false;
        boolean done2 = false;
        boolean validInput = false;
        boolean roundTwoOver = false;
        String inputYN;
        int firstDiceSum;
        int secondDiceSum;


        do {
            //First Rolls
            die1 = rnd.nextInt(6)+ 1;
            die2 = rnd.nextInt(6)+ 1;
            firstDiceSum = die1 + die2;
            System.out.println("die one is " + die1 + " die two is " + die2 + " the total is " + firstDiceSum);
            if (firstDiceSum == 2)
            {
                System.out.println("It's a craps you lost");
                done1 = true;
            } else if (firstDiceSum == 3)
            {
                System.out.println("It's a craps you lost");
                done1 = true;
            } else if (firstDiceSum == 12)
            {
                System.out.println("It's a craps you lost");
                done1 = true;
            } else if (firstDiceSum == 7)
            {
                System.out.println("It's a natural you won");
                done1 = true;
            } else if (firstDiceSum == 11)
            {
                System.out.println("It's a natural you won");
                done1 = true;
            } else
            {
                done1 = false;
            }

            //Dice rolls past the first two
            if (!done1)
            {
                do {
                    die1 = rnd.nextInt(6)+ 1;
                    die2 = rnd.nextInt(6)+ 1;
                    secondDiceSum = die1 + die2;
                    System.out.println("You are rolling to beat " + firstDiceSum + " rolling dice... dice one is " + die1 + " die two is " + die2 + " the total is " + secondDiceSum);
                    if (secondDiceSum == 7)
                    {
                        roundTwoOver = true;
                        System.out.println("You rolled a seven and lost");
                    } else if (secondDiceSum == firstDiceSum)
                    {
                        roundTwoOver = true;
                        System.out.println("You met the point sum of " + firstDiceSum + " So you won!");
                    }

                }while(!roundTwoOver);

            }

            do {
                System.out.print("Would you like to continue playing? [Y/N] :");
                inputYN = in.nextLine();
                if (inputYN.equalsIgnoreCase("Y"))
                {
                    validInput = true;
                    done2 = false;
                } else if (inputYN.equalsIgnoreCase("N"))
                {
                    validInput = true;
                    done2 = true;
                } else
                {
                    System.out.println("You entered " + inputYN + " That is not a valid input");
                }

            }while (!validInput);
        }while (!done2);


    }

}