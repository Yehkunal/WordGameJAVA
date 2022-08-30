package WordGame;

import java.util.Random;

public class Words {

	private String[] randomWords = { "animals", "happiness", "indefinite", "steady", "birthday", "extreme", "rights",
			"properties", "ceremony", "independence", "beneath", "information", "students", "employee" };

	private String selectedWord;

	private Random random = new Random();
	private char letters[];

	public Words() {
		selectedWord = randomWords[random.nextInt(randomWords.length)];
		letters = new char[selectedWord.length()];

	}

	public String xyz() {

		StringBuilder word = new StringBuilder();

		for (char letter : letters) {

			if (letter == '\u0000') {
				word.append("-");
			} else
				word.append(letter);

			word.append(" ");
		}

		return word.toString();
	}

	public void guess(char letter) {
		// TODO Auto-generated method stub

		for (int i = 0; i < selectedWord.length(); i++) {
			if (letter == selectedWord.charAt(i)) {
				letters[i] = letter;
			}
		}

	}

	public boolean isGuessedRight() {
		// TODO Auto-generated method stub

		for (char letter : letters) {
			if (letter == '\u0000')
				return false;
		}
		return true;
	}
}
