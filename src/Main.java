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
