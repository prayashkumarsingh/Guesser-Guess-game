import java.util.*;

class guesser {
	int guessNum;

	int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser kindly guess the number between 0-10");
		guessNum = scan.nextInt();
		if (guessNum >= 0 && guessNum <= 10) {
			System.out.println("Thanks for Choosing the No.");
		} else {
			System.out.println("The No. is not between 0-10........ ");
			System.out.println("Please Enter Again");
			guessNum = scan.nextInt();
		}

		return guessNum;
	}
}

class Player {
	int guessNum;

	int guessNum1()

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 1 kindly guess the number between 0-10");

		guessNum = scan.nextInt();
		if (guessNum >= 0 && guessNum <= 10) {
			System.out.println("Thanks for Choosing the No.");
		} else {
			System.out.println("The No. is not between 0-10........ ");
			System.out.println("Please Enter Again");
			guessNum = scan.nextInt();
		}
		return guessNum;
	}

	int guessNum2()

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 2 kindly guess the number between 0-10");

		guessNum = scan.nextInt();
		if (guessNum >= 0 && guessNum <= 10) {
			System.out.println("Thanks for Choosing the No.  between 0-10");
		} else {
			System.out.println("The No. is not between 0-10........ ");
			System.out.println("Please Enter Again");
			guessNum = scan.nextInt();
		}
		return guessNum;
	}

	int guessNum3()

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 3 kindly guess the number between 0-10");

		guessNum = scan.nextInt();
		if (guessNum >= 0 && guessNum <= 10) {
			System.out.println("Thanks for Choosing the No.  between 0-10");
		} else {
			System.out.println("The No. is not between 0-10........ ");
			System.out.println("Please Enter Again");
			guessNum = scan.nextInt();
		}
		return guessNum;
	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();

	guesser g = new guesser();

	void collectNumFromGuesser() {

		numFromGuesser = g.guessNum();
	}

	void collectNumFromPlayers() {

		numFromPlayer1 = p1.guessNum1();
		numFromPlayer2 = p2.guessNum2();
		numFromPlayer3 = p3.guessNum3();
	}

	void collectNumFrmP1P2() {
		numFromPlayer1 = p1.guessNum1();
		numFromPlayer2 = p2.guessNum2();
	}

	void collectNumFrmP1P3() {
		numFromPlayer1 = p1.guessNum1();
		numFromPlayer3 = p3.guessNum3();
	}

	void collectNumFrmP3P2() {
		numFromPlayer3 = p3.guessNum3();
		numFromPlayer2 = p2.guessNum2();
	}

}

class Compare {
	Umpire u = new Umpire();

	void call() {
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
	}

	void compareP1P2() {
		if (u.numFromGuesser == u.numFromPlayer2 && u.numFromGuesser == u.numFromPlayer1) {
			System.out.println("The game is Again Tied Between Player 1 And Player 2");
			System.out.println("Restart The game Again");
		} else if (u.numFromGuesser == u.numFromPlayer2 && u.numFromGuesser != u.numFromPlayer1) {
			System.out.println("Player 2 Won The Game");
		} else if (u.numFromGuesser != u.numFromPlayer2 && u.numFromGuesser == u.numFromPlayer1) {
			System.out.println("Player 1 Won the Game");
		} else {
			System.out.println("Game Lost For Guessing Wrong Nos.");
		}
	}

	void compareP1P3() {
		if (u.numFromGuesser == u.numFromPlayer3 && u.numFromGuesser == u.numFromPlayer1) {
			System.out.println("The game is Again Tied Between Player 1 And Player 3");
			System.out.println("Restart The game Again");
		} else if (u.numFromGuesser == u.numFromPlayer3 && u.numFromGuesser != u.numFromPlayer1) {
			System.out.println("Player 3 Won The Game");
		} else if (u.numFromGuesser != u.numFromPlayer3 && u.numFromGuesser == u.numFromPlayer1) {
			System.out.println("Player 1 Won the Game");
		} else {
			System.out.println("Game Lost For Guessing Wrong Nos.");
		}
	}

	void compareP3P2() {
		if (u.numFromGuesser == u.numFromPlayer2 && u.numFromGuesser == u.numFromPlayer3) {
			System.out.println("The game is Again Tied Between Player 3 And Player 2");
			System.out.println("Restart The game Again");
		} else if (u.numFromGuesser == u.numFromPlayer2 && u.numFromGuesser != u.numFromPlayer3) {
			System.out.println("Player 2 Won The Game");
		} else if (u.numFromGuesser != u.numFromPlayer2 && u.numFromGuesser == u.numFromPlayer3) {
			System.out.println("Player 3 Won the Game");
		} else {
			System.out.println("Game Lost For Guessing Wrong Nos.");
		}
	}

	void compare1() {
		if (u.numFromGuesser == u.numFromPlayer1) {
			if (u.numFromGuesser == u.numFromPlayer2 && u.numFromGuesser == u.numFromPlayer3) {
				System.out.println("All players guessed the Exact No.    So the Game is tied..........");
				System.out.println("Play Again .......");
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				compare2();

			} else if (u.numFromGuesser == u.numFromPlayer2) {
				System.out.println("The game is tied between Player 1 & Player2");
				System.out.println("Player 1 & Player2 Please Choose the No. Again........");
				u.collectNumFromGuesser();
				u.collectNumFrmP1P2();
				compareP1P2();
			} else if (u.numFromGuesser == u.numFromPlayer3) {
				System.out.println("The game is tied between Player 1 & Player3");
				System.out.println("Player 1 & Player3 Please Choose the No. Again..........");
				u.collectNumFromGuesser();
				u.collectNumFrmP1P3();
				compareP1P3();
			} else {
				System.out.println("Player 1 won the game");
			}
		} else if (u.numFromGuesser == u.numFromPlayer2) {
			if (u.numFromGuesser == u.numFromPlayer3) {
				System.out.println("The game is tied between Player 2 & Player3");
				System.out.println("Player 2 & Player3 Please Choose the No. Again............");
				u.collectNumFromGuesser();
				u.collectNumFrmP3P2();
				compareP3P2();
			} else {
				System.out.println("Player 2 won the game");
			}
		} else if (u.numFromGuesser == u.numFromPlayer3) {
			System.out.println("Player 3 won the game");
		} else {
			System.out.println("Game lost Try Again!");
		}
	}

	void compare2() {
		if (u.numFromGuesser == u.numFromPlayer1) {
			if (u.numFromGuesser == u.numFromPlayer2 && u.numFromGuesser == u.numFromPlayer3) {
				System.out.println("All players guessed the Exact No.    So the Game is tied");
				System.out.println("Play Again By Choosinging The Nos..");
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				compare1();

			} else if (u.numFromGuesser == u.numFromPlayer2) {
				System.out.println("The game is tied between Player 1 & Player2");
				System.out.println("Player 1 & Player2 Please Choose the No. Again..........");
				u.collectNumFromGuesser();
				u.collectNumFrmP1P2();
				compareP1P2();
			} else if (u.numFromGuesser == u.numFromPlayer3) {
				System.out.println("The game is tied between Player 1 & Player3");
				System.out.println("Player 1 & Player3 Please Choose the No. Again..........");
				u.collectNumFromGuesser();
				u.collectNumFrmP1P3();
				compareP1P3();
			} else {
				System.out.println("Player 1 won the game");
			}
		} else if (u.numFromGuesser == u.numFromPlayer2) {
			if (u.numFromGuesser == u.numFromPlayer3) {
				System.out.println("The game is tied between Player 2 & Player3");
				System.out.println("Player 2 & Player3 Please Choose the No. Again.............");
				u.collectNumFromGuesser();
				u.collectNumFrmP3P2();
				compareP3P2();
			} else {
				System.out.println("Player 2 won the game");
			}
		} else if (u.numFromGuesser == u.numFromPlayer3) {
			System.out.println("Player 3 won the game");
		} else {
			System.out.println("Game lost Try Again!");
		}

	}
}

public class Guessergame {

	public static void main(String[] args) {

		Compare c = new Compare();

		c.call();
		c.compare2();

	}

}
