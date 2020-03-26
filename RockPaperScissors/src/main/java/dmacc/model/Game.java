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

		String computerPlayer = "";

		Random theChoice = new Random();

		int ComputerPlayerToRandom = theChoice.nextInt(3);

		Random r = new Random();

		int i = r.nextInt(3);

		if (i == 0)

			computerPlayer = "Rock";

		else if (i == 1)

			computerPlayer = "Paper";

		else if (i == 2)

			computerPlayer = "Scissors";

		this.setComputerPlayerToRandom();

	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
}
