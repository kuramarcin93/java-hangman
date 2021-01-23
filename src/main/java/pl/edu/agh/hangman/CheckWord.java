package pl.edu.agh.hangman;

public class CheckWord {
	
	public void checkWord(String word) {
		
//		String word = "JAVA";
		String let = "A";
		String[] letters = word.split("");
		String[] wordCheck = new String[letters.length];
		int counter = 0;
		
//	while ()
		for (int i=0; i<wordCheck.length;i++) {
			if (word.contains(let)) {
				if(letters[i].equals(let)) {
				wordCheck[i] = let; } else {wordCheck[i] = "_";}
			} else if (!word.contains(let)) {
				System.out.println("Błąd");
			}
		}
		
//		System.out.print(counter);
		for(String letter : wordCheck) {
			System.out.print(letter);
		}
	
		
	}

}
