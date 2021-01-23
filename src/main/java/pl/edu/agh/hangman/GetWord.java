package pl.edu.agh.hangman;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class GetWord {

	public static String scanFile(String filename) throws Exception {

		Random random = new Random();

		int genRandom = random.nextInt(1600);

		File slowa = new File(filename);

		Scanner scanner = new Scanner(slowa);

		String word1 = "";
		int tokenCounter = 0;
		while (scanner.hasNext()) {

			String word2 = scanner.next();
			tokenCounter++;
			if (tokenCounter == genRandom) {
				word1 = word2;
			}
		}
		scanner.close();
		return word1;
	}

}
