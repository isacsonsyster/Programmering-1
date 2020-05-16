import java.util.Scanner;
import java.util.ArrayList;
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

	
	
	

		
	
	
		
		





	
	
	
	/**
	 * this method will check if the letter the player are guessing are in the word or not
	 * @return if the letter was right or not 
	 */
	
	public static void checkIfRight(){
		boolean rightLetter = false;
		for(int i = 0; i < wordToGuess.length; i++) {
			if (wordToGuess[i] == guessedLetter) {
				System.out.println("Bra, du gissade rätt!");
				guessedWord[i] = guessedLetter;
				rightLetter = true;
				
				if(rightLetter = false) {
					System.out.println("Tyvärr, du gissade fel, testa att gissa en annan bokstav");
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
		"Trilla","Sill","Klass","Kallare","Hårborste","Naglar","Kommer","Mycket","Sverige","Stora","Inget","Samma",
		"Människor","Europa","Barnen","Händer","Kallelse"};
		System.out.println("Du valde den lätta nivån.");
		System.out.println("Du kommer ha 15 gissningar på dig att gissa rätt ord");
		System.out.println("Kör hårt och lycka till!");
		int guessesLeft = 15;
		char[] wordToGuess = easyWords[random.nextInt(easyWords.length)].toCharArray();
	}
	
	public static void mediumLevel(){
		String[] mediumWords = {"Företaget", "Skola", "Dator", "Hårsnodd", "Såga", "Lat", "Bläckpenna",
		"Förlåt", "Men", "Virknål", "Körskola", "Kyrka", "Maten", 
		"Måttband", "Galler", "Grav", "Inlagd"};
		System.out.println("Du valde medel nivån");
		System.out.println("Du kommer ha 11 gissningar på dig att gissa rätt ord");
		System.out.println("Det är svårare ord än den lätta nivån");
		System.out.println("Lycka till");
		int guessesLeft = 11;
		char[] wordToGuess = mediumWords[random.nextInt(mediumWords.length)].toCharArray();
	}
	
	public static void hardLevel (){
		String [] hardWords = { "Jazz", "Flaggstång", "Extra", "Vispgrädde", "Portion", "Xylofon", 
		"Psykolog", "Krokodiltårar", "Croissanter", "Squash", "Nationalencyklopedin", 
		"Justitieminister", "Växsjö", "Hundkoja", "Yatzy",  "Ukulele", "Yxa", "Oxe", "Taxi",};
		System.out.println("Du valde den svåra nivån");
		System.out.println("Du kommer ha 8 gissningar på dig att gissa rätt ord");
		System.out.println("Använd dem väl");
		System.out.println("Det är väldigt mycket svårare ord än medel och lätta nivån");
		System.out.println("Lycka till, du kommer behöva det");
		int guessesLeft = 8;
		char [] wordToGuess = hardWords[random.nextInt(hardWords.length)].toCharArray(); // slumpar ett ord från en arraylist och lägger in i en chararray så att man kan gissa på ordet.// 

	}
	
	public static void guessedLetter() {
		guessedWord = new char [wordToGuess.length];
		for (int i = 0; i < guessedWord.length; i++) {
			guessedWord [i] = '_';
		}
		System.out.println(guessedWord);
	}
	
	
	
}

