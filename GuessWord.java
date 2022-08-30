package WordGame;

import java.util.Scanner;

public class GuessWord {
private boolean play = true;
	
	private Words randomWords= new Words();
	private Scanner sc=new Scanner(System.in);
	private char lastRound;
	private int maxRound=20;

	public void start() {
	do {
		showWord();
		getinput();
		checkinput();		
	}
	while(play);

}

	void showWord() {
		System.out.println(randomWords.xyz());
	}

	void getinput() {
		System.out.println("Enter a Letter To guess The word: ");
		String userGuess= sc.nextLine();	
		lastRound=userGuess.charAt(0);
	}

	public void checkinput() {
		
		randomWords.guess(lastRound);
		
		
		if(randomWords.isGuessedRight()) {
			System.out.println("Congrats You Won");	
			System.out.println("The Guessed word is: "+randomWords.xyz());
			play =false;
		}
		

	}

	public void end() {
		// TODO Auto-generated method stub
		sc.close();
		
	}
}
