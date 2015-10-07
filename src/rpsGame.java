import java.util.Scanner;
import java.util.Random;


public class rpsGame {
	
	public static void main(String[] args)
{
		String user;
		String computer = "";
		int computerInt;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.println("Alright, what's it going to be? Rock, paper, or scissors? \n" + 
		"Pick a move!\n" + "r = rock, p = paper, and s = scissors.");
		
		
		System.out.println();
		
		computerInt = generator.nextInt(3)+1;
		
		if (computerInt == 1)
			computer = "r";
		else if (computerInt == 2)
			computer = "p";
		else if (computerInt == 3)
			computer = "s";
		
		System.out.println("Place your move here: ");
		user = scan.next();
		
		System.out.println("The computer chose: " + computer);
		
		
		if (user.equals(computer))
			System.out.println("Whoa, it's a tie!");
		else if (user.equals("r"))
			if (computer.equals("s"))
				System.out.println("Rock beats scissors! You win!");
			else if (computer.equals("p"))
				System.out.println("Paper beats rock. Sorry, you lose.");
			else if (user.equals("p"))
				if (computer.equals("s"))
					System.out.println("Scissors beats paper. Sorry, you lose.");
				else if (computer.equals("r"))
					System.out.println("Paper beats rock! You win!");
				else if (user.equals("s"))
					if (computer.equals("p"))
						System.out.println("Scissors beat paper! You win!");
					else if (computer.equals("r"))
						System.out.println("Rock beats scissors. Sorry, you lose.");
					else 
						System.out.println("Invalid user input.");
}

}
