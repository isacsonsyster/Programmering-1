import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class hangagubben {
	public static Scanner input = new Scanner (System.in);
	public static Random random = new Random();
	public static char[] wordToGuess; 
	public static int guessesLeft;
	public static char[] guessedWord;
	public static int correctWord;
	public static ArrayList<Character> guessedLetters = new ArrayList<Character>();
	public static char guessedLetter;
	public static void main(String[] args) {
	
		
	}

	
	
	

		
	
	
	
		




	public static void playGame() {
		guessedWord ();
		System.out.println("ordet du ska gissa p� �r " + wordToGuess.length + "bokst�ver l�ngt");
		
		boolean guessedLetter = false;
		while (!guessedLetter && guessesLeft!=0) {
			checkIfRight();
			guessedLetter = doneWithWord();
			System.out.println("Ordet" + Arrays.toString(guessedWord));
			if (guessedLetters.size() == 0) {
				System.out.println("Du har alla dina gissningar kvar." + guessesLeft);
				
			}
				else {
					System.out.println("du har" + guessesLeft + "gissningar kvar");
				}
			}
		}
		
	}
	
	
	
	/**
	 * this method will check if the letter the player are guessing are in the word or not
	 * @return if the letter was right or not 
	 */
	
	public static void checkIfRight(){
		boolean rightLetter = false;
		for(int i = 0; i < wordToGuess.length; i++) {
			if (wordToGuess[i] == guessedLetter) {
				System.out.println("Bra, du gissade r�tt!");
				guessedWord[i] = guessedLetter;
				rightLetter = true;
				
				if(rightLetter = false) {
					System.out.println("Tyv�rr, du gissade fel, testa att gissa en annan bokstav");
					if(guessedLetters.contains(guessedLetter)) {
					}
					else {
						guessedLetters.add(guessedLetter){
						}
					}
				}
			}
		}
	}

		
	
	
	public static void easyLevel(){
		String [] easyWords = {
		"Trilla","Sill","Klass","Kallare","H�rborste","Naglar","Kommer","Mycket","Sverige","Stora","Inget","Samma",
		"M�nniskor","Europa","Barnen","H�nder","Kallelse"};
		System.out.println("Du valde den l�tta niv�n.");
		System.out.println("Du kommer ha 15 gissningar p� dig att gissa r�tt ord");
		System.out.println("K�r h�rt och lycka till!");
		int guessesLeft = 15;
		char[] wordToGuess = easyWords[random.nextInt(easyWords.length)].toCharArray();
	}
	
	public static void mediumLevel(){
		String[] mediumWords = {"F�retaget", "Skola", "Dator", "H�rsnodd", "S�ga", "Lat", "Bl�ckpenna",
		"F�rl�t", "Men", "Virkn�l", "K�rskola", "Kyrka", "Maten", 
		"M�ttband", "Galler", "Grav", "Inlagd"};
		System.out.println("Du valde medel niv�n");
		System.out.println("Du kommer ha 11 gissningar p� dig att gissa r�tt ord");
		System.out.println("Det �r sv�rare ord �n den l�tta niv�n");
		System.out.println("Lycka till");
		int guessesLeft = 11;
		char[] wordToGuess = mediumWords[random.nextInt(mediumWords.length)].toCharArray();
	}
	
	public static void hardLevel (){
		String [] hardWords = { "Jazz", "Flaggst�ng", "Extra", "Vispgr�dde", "Portion", "Xylofon", 
		"Psykolog", "Krokodilt�rar", "Croissanter", "Squash", "Nationalencyklopedin", 
		"Justitieminister", "V�xsj�", "Hundkoja", "Yatzy",  "Ukulele", "Yxa", "Oxe", "Taxi",};
		System.out.println("Du valde den sv�ra niv�n");
		System.out.println("Du kommer ha 8 gissningar p� dig att gissa r�tt ord");
		System.out.println("Anv�nd dem v�l");
		System.out.println("Det �r v�ldigt mycket sv�rare ord �n medel och l�tta niv�n");
		System.out.println("Lycka till, du kommer beh�va det");
		int guessesLeft = 8;
		char [] wordToGuess = hardWords[random.nextInt(hardWords.length)].toCharArray(); // slumpar ett ord fr�n en arraylist och l�gger in i en chararray s� att man kan gissa p� ordet.// 

	}
	
	public static void guessedWord() {
		guessedWord = new char [wordToGuess.length];
		for (int i = 0; i < guessedWord.length; i++) {
			guessedWord [i] = '_';
		}
		System.out.println(guessedWord);
	}
	
	public static boolean doneWithWord() {
		for (int i = 0; i < guessedWord.length; i++) {
			if (guessedWord[i] == '_') {
				return false;
			}
		}
	}
	
	
}

