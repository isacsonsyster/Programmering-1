import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class hangagubben {
	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.println("Hej och välkommen till hänga gubben.");
	
	
		ArrayList<String> easyWords = new ArrayList<String>();
		easyWords.add("Trilla");
		easyWords.add("Sill");
		easyWords.add("Klass");
		easyWords.add("Kallare");
		easyWords.add("Hårborste");
		easyWords.add("Naglar");
		easyWords.add("Kommer");
		easyWords.add("Mycket");
		easyWords.add("Sverige");
		easyWords.add("Stora");
		easyWords.add("Inget");
		easyWords.add("Samma");
		easyWords.add("Människor");
		easyWords.add("Europa");
		easyWords.add("Barnen");
		easyWords.add("Händer");
		easyWords.add("Kallelse");

		
		ArrayList<String> mediumWords = new ArrayList<String>();
		mediumWords.add("Företaget");
		mediumWords.add("Skola");
		mediumWords.add("Dator");
		mediumWords.add("Hårsnodd");
		mediumWords.add("Såga");
		mediumWords.add("Lat");
		mediumWords.add("Inlagd");
		mediumWords.add("Säga");
		mediumWords.add("Låt");
		mediumWords.add("Förlåt");
		mediumWords.add("Men");
		mediumWords.add("Anteckningsblock");
		mediumWords.add("Måttband");
		mediumWords.add("Dalarna");
		mediumWords.add("Virknål");
		mediumWords.add("Sticka");
		mediumWords.add("Galler");
		mediumWords.add("Bläckpenna");
		mediumWords.add("Tråd");
		mediumWords.add("Äta");
		mediumWords.add("Körskola");
		mediumWords.add("Kyrka");
		mediumWords.add("Grav");
		mediumWords.add("Maten");
		
		ArrayList<String> hardWords = new ArrayList<String>();
		hardWords.add("Jazz");
		hardWords.add("Flaggstång");
		hardWords.add("Extra");
		hardWords.add("Vispgrädde");
		hardWords.add("Ukulele");
		hardWords.add("Saxofon");
		hardWords.add("Xylofon");
		hardWords.add("Portion");
		hardWords.add("Yatzy");
		hardWords.add("Psykolog");
		hardWords.add("Marabou");
		hardWords.add("Hundkoja");
		hardWords.add("Yxa");
		hardWords.add("Oxe");
		hardWords.add("Vas");
		hardWords.add("Krokodiltårar");
		hardWords.add("Häst");
		hardWords.add("Croissanter");
		hardWords.add("Vibrationer");
		hardWords.add("Byxa");
		hardWords.add("Taxi");
		hardWords.add("Squash");
		hardWords.add("Nationalencyklopedin");
		hardWords.add("Epidemiologi");
		hardWords.add("Justitieminister");
		hardWords.add("Växsjö");





	
	
	}
	/**
	 * this method will check if the letter the player are guessing are in the word or not
	 * @return if the letter was right or not 
	 */
	
	public static boolean checkIfRight(){
		boolean rightLetter = false;
		for(i=0; i<wordToGuess; i++) {
			if (wordToGuess[i] = guessedLetter) {
				System.out.println("Bra, du gissade rätt!");
				correctWord[i] = guessedLetter;
				rightLetter = true;
				
				if(rightLetter = false) {
					System.out.println("Tyvärr, du gissade fel, testa att gissa en annan bokstav");
					if(wrongLetters.contains(guessedLetter)) {
					}
					else {
						wrongLetters.add(guessedLetter){
						}
					}
				}
			}
		}
	}
	public static Array guessedWordSoFar{
		
	}
	
	public static void easyLevel{
		System.out.println("Du valde den lätta nivån.");
		System.out.println("Du kommer ha 15 gissningar på dig att gissa rätt ord");
		System.out.println("Kör hårt och lycka till!");
		
		wordToGuess = easyWords[random.nextInt(easyWords.length).toCharArray]
	}
	
	public static void mediumLevel{
		
	}
	
	public static void hardLevel
}

