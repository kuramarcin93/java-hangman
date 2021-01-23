package pl.edu.agh.hangman;

public class CheckWord {

	public static void checkWord(String word, String[] HANGMANPICS) {

//		String word = "JAVA";
		String let = "B";
		String[] letters = word.split("");
		String[] wordCheck = new String[letters.length];
		String[] hiddenWordCheck = new String[letters.length];

		for (int i = 0; i <= hiddenWordCheck.length-1; i++) {
			hiddenWordCheck[i] = "_ ";
		}

		int counter = 0;
		for (int i = 0; i < wordCheck.length; i++) {
			
			if (word.contains(let)) {
				if (letters[i].equals(let)) {
					hiddenWordCheck[i] = let;
				}
			} else if (!word.contains(let)) {
				counter++;
				System.out.println(HANGMANPICS[counter]);
			}
		}
//		System.out.print(counter);
		for (String letter : hiddenWordCheck) {
			System.out.print(letter);
		}

	}

}
