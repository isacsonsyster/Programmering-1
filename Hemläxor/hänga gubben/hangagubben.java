import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class hangagubben {
	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.println("Hej och v�lkommen till h�nga gubben.");
	
	
		ArrayList<String> easyWords = new ArrayList<String>();
		easyWords.add("Trilla");
		easyWords.add("Sill");
		easyWords.add("Klass");
		easyWords.add("Kallare");
		easyWords.add("H�rborste");
		easyWords.add("Naglar");
		easyWords.add("Kommer");
		easyWords.add("Mycket");
		easyWords.add("Sverige");
		easyWords.add("Stora");
		easyWords.add("Inget");
		easyWords.add("Samma");
		easyWords.add("M�nniskor");
		easyWords.add("Europa");
		easyWords.add("Barnen");
		easyWords.add("H�nder");
		easyWords.add("Kallelse");

		
		ArrayList<String> mediumWords = new ArrayList<String>();
		mediumWords.add("F�retaget");
		mediumWords.add("Skola");
		mediumWords.add("Dator");
		mediumWords.add("H�rsnodd");
		mediumWords.add("S�ga");
		mediumWords.add("Lat");
		mediumWords.add("Inlagd");
		mediumWords.add("S�ga");
		mediumWords.add("L�t");
		mediumWords.add("F�rl�t");
		mediumWords.add("Men");
		mediumWords.add("Anteckningsblock");
		mediumWords.add("M�ttband");
		mediumWords.add("Dalarna");
		mediumWords.add("Virkn�l");
		mediumWords.add("Sticka");
		mediumWords.add("Galler");
		mediumWords.add("Bl�ckpenna");
		mediumWords.add("Tr�d");
		mediumWords.add("�ta");
		mediumWords.add("K�rskola");
		mediumWords.add("Kyrka");
		mediumWords.add("Grav");
		mediumWords.add("Maten");
		
		ArrayList<String> hardWords = new ArrayList<String>();
		hardWords.add("Jazz");
		hardWords.add("Flaggst�ng");
		hardWords.add("Extra");
		hardWords.add("Vispgr�dde");
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
		hardWords.add("Krokodilt�rar");
		hardWords.add("H�st");
		hardWords.add("Croissanter");
		hardWords.add("Vibrationer");
		hardWords.add("Byxa");
		hardWords.add("Taxi");
		hardWords.add("Squash");
		hardWords.add("Nationalencyklopedin");
		hardWords.add("Epidemiologi");
		hardWords.add("Justitieminister");
		hardWords.add("V�xsj�");





	
	
	}
	/**
	 * this method will check if the letter the player are guessing are in the word or not
	 * @return if the letter was right or not 
	 */
	
	public static boolean checkIfRight(){
		boolean rightLetter = false;
		for(i=0; i<wordToGuess; i++) {
			if (wordToGuess[i] = guessedLetter) {
				System.out.println("Bra, du gissade r�tt!");
				correctWord[i] = guessedLetter;
				rightLetter = true;
				
				if(rightLetter = false) {
					System.out.println("Tyv�rr, du gissade fel, testa att gissa en annan bokstav");
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
		System.out.println("Du valde den l�tta niv�n.");
		System.out.println("Du kommer ha 15 gissningar p� dig att gissa r�tt ord");
		System.out.println("K�r h�rt och lycka till!");
		
		wordToGuess = easyWords[random.nextInt(easyWords.length).toCharArray]
	}
	
	public static void mediumLevel{
		
	}
	
	public static void hardLevel
}

