package dmacc.model;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	

	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}

	private void determineWinner() {
		// TODO Auto-generated method stub
		String winner = "Alex";

		if (player1.equalsIgnoreCase("Rock")) {

			switch (computerPlayer.toLowerCase()) {
			case "rock":
				winner = ("A tie!");
				break;
			case "paper":
				winner = ("Paper");
				break;
			case "scissors":
				winner = ("Rock");
				break;

			}

		} else if (player1.equalsIgnoreCase("Paper")) {

			switch (computerPlayer.toLowerCase()) {
			case "rock":
				winner = ("Paper");
				break;
			case "paper":
				winner = ("A tie!");
				break;
			case "scissors":
				winner = ("scissors");
				break;

			}

		} else if (player1.equalsIgnoreCase("scissors")) {
			switch (computerPlayer.toLowerCase()) {
			case "rock":
				winner = ("Rock");
				break;
			case "paper":
				winner = ("Scissors");
				break;
			case "scissors":
				winner = ("A tie!");
				break;

			}

		}

		this.setWinner(winner);
	}

	

	private void setComputerPlayerToRandom() {
		// TODO Auto-generated method stub

		/*
		 * String computerPlayer = ""; 
		 * 
		 * This is not using the instance variable - this is
		 * creating a local variable inside the method called computerPlayer.
		 * How do you reference and set the instance variable?
		 * 
		 * Hint: by commenting out the declaration of the variable like I have already
		 * done. I would recommend changing all the computerPlayer = "Rock"; sets to
		 * this.computerPlayer = "Rock"; so you really understand that the instance
		 * variable is being set
		 */

		/*
		 * Random theChoice = new Random();
		 * 
		 * int ComputerPlayerToRandom = theChoice.nextInt(3);
		 * 
		 * This is duplicate code to below.  Except you are using the int i variable and not
		 * the ComputerPlayerToRandom variable.
		 */
		

		Random r = new Random();

		int i = r.nextInt(3);

		if (i == 0)

			computerPlayer = "Rock";

		else if (i == 1)

			computerPlayer = "Paper";

		else if (i == 2)

			computerPlayer = "Scissors";

		/*
		 * this.setComputerPlayerToRandom(); 
		 * 
		 * why are you calling this method again
		 * inside this method? You've basically made a recursive function.
		 * This is why the 500 error is appearing over and over again.
		 */
		
		/*
		 * After making these changes, you'll still have some errors in the results.html
		 * to resolve but it will work.
		 */		
	}

	/*
	 * public String getWinner() { return winner; }
	 * 
	 * public void setWinner(String winner) { this.winner = winner; }
	 * 
	 * You don't need these methods because the @Data annotation 
	 * automatically generates these for you.
	 */
}
