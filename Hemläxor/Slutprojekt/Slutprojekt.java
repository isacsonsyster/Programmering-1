import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Slutprojekt {
	
		public static int chooseWhichLevel;
		public static int guessesLeft;
		public static ArrayList<String> easyWords; 
		public static ArrayList<String> mediumWords;
		public static ArrayList<String> hardWords;
		public static String wordToConvertToGuess;
		public static ArrayList<String> wordToGuess;
		public static ArrayList<String> wordGuessedSoFar;
		public static Random word;
		public static String guessedLetter;
		public static ArrayList<String>playersGuesses;
		public static int chooseAgain;
		public static ArrayList<String> wrongGuesses;


		public static void main(String[] args) {
			startGame();
			playGame();
			
		}
		
		
		//raderar allt som finns i listorna med lagrade gissningar s� att det inte blir n�got konstigt sen n�r spelet startas igen via playgame
		public static void clearLists() {
			playersGuesses.clear();
			wrongGuesses.clear();
		}
		
		/**
		 * startar spelet och l�ter en v�lja sv�righetsgrad som man vill spela
		 */
	public static void startGame() {
		System.out.println("v�lkommen till h�nga gubben");
		System.out.println("Ett ord kommer slumpas fram och det g�ller f�r dig att gissa r�tt p� vilket ord det �r");
		System.out.println("du ska nu f� v�lja sv�righetsgrad:");
		System.out.println("skriv 1 f�r l�tt,");
		System.out.println("skriv 2 f�r medium");
		System.out.println("och 3 f�r sv�r");
		Scanner input = new Scanner(System.in);
		chooseWhichLevel = input.nextInt();
		
		if (chooseWhichLevel == 1){
			easyLevel();
			guessesLeft = 15;
		}
		else if (chooseWhichLevel == 2) {
			mediumLevel();
			guessesLeft = 11;
		}

		else if (chooseWhichLevel == 3){
			hardLevel();
			guessesLeft = 8;
		}
	}
	
		/**
		 * en arraylist som lagrar orden f�r den l�tta niv�n
		 */
		public static void easyWordsToGuess(){
			
			easyWords = new ArrayList<String>();
		
			easyWords.add("naglar");
			easyWords.add("h�nder");
			easyWords.add("kommer");
			easyWords.add("mycket");
			easyWords.add("sverige");
			easyWords.add("england");
			easyWords.add("trilla");
			easyWords.add("klass");
			easyWords.add("sill");
			
			Random word = new Random();

		}
		/**
		 * en arraylist som lagrar orden f�r medelniv�n
		 */
		public static void mediumWordsToGuess(){
			
		
			mediumWords = new ArrayList<String>();
			
			mediumWords.add("dator");
			mediumWords.add("h�rsnodd");
			mediumWords.add("grav");
			mediumWords.add("galler");
			mediumWords.add("inlagd");
			mediumWords.add("f�rl�t");
			mediumWords.add("m�ttband");
			mediumWords.add("kyrka");
			mediumWords.add("maten");
			mediumWords.add("�sna");
			
			Random word = new Random();


		}
		
		/**
		 * en arraylist som lagrar orden f�r den sv�ra niv�n
		 */
		public static void hardWordsToGuess(){
			
		
			hardWords = new ArrayList<String>();
			
			hardWords.add("jazz");
			hardWords.add("flaggst�ng");
			hardWords.add("extra");
			hardWords.add("vispgr�dde");
			hardWords.add("croissanter");
			hardWords.add("nationalencyklopedin");
			hardWords.add("yatzy");
			hardWords.add("squash");
			hardWords.add("v�xj�");
			hardWords.add("ukulele");
			
			Random wordToConvertToGuess = new Random();

			
		}

		/**
		 * Ska ta in ett v�rde fr�n easywords och skriva ut hur m�nga bokst�ver det �r i ordet.
		 */
			public static void easyLevel() {

				
				for(int i = 0; i< wordToConvertToGuess.length(); i++) {
					String e = String.valueOf(wordToConvertToGuess.charAt(i));
					wordToGuess.add(e);
				}
				
					System.out.println("ordet du ska gissa p� �r" + wordToConvertToGuess.length() + "bokst�ver l�ngt" );
			}
			
			/**
			 * Ska ta in ett v�rde fr�n mediumwords och skriva ut hur m�nga bokst�ver det �r i ordet.
			 */
			public static void mediumLevel() {
				
				for(int i = 0; i< wordToConvertToGuess.length(); i++) {
					String e = String.valueOf(wordToConvertToGuess.charAt(i));
					wordToGuess.add(e);
				}
				
				
				System.out.println("ordet du ska gissa p� �r" + wordToConvertToGuess.length() + "bokst�ver l�ngt" );
			}
			
			/**
			 * Ska ta in ett v�rde fr�n hardwords och skriva ut hur m�nga bokst�ver det �r i ordet.
			 */
			public static void hardLevel() {
				
				for(int i = 0; i< wordToConvertToGuess.length(); i++) {
					String e = String.valueOf(wordToConvertToGuess.charAt(i));
					wordToGuess.add(e);
				}
				
				System.out.println("ordet du ska gissa p� �r" + wordToConvertToGuess.length() + "bokst�ver l�ngt" );
			}
			
			/**
			 * ska skriva ut alla bokst�ver som linjer
			 * @param numberOfLetters en int f�r att h�lla nummer
			 */
			public static void makeWordToLines(int numberOfLetters) {
				
				for(int i = 0; i < numberOfLetters; i++) {
					wordGuessedSoFar.add("_");
					
					
				}
			}
			
			/**
			 * sj�lva spelet d�r man gissar p� en bokstav
			 */
			public static void playGame() {
			
				for(int i = 0; i <wordGuessedSoFar.size(); i++) {
					System.out.print(wordGuessedSoFar.get(i));
				}

				System.out.println("Gissa p� en bokstav");
				Scanner guessedLetter = new Scanner(System.in);
				checkIfRight();
			}
			
			
			/**
			 * ska kolla om spelarens gissning �r r�tt eller inte och hur m�nga gissningar det �r kvar
			 */
			public static void checkIfRight() {
				for(int i = 0; i < playersGuesses.size(); i++) {
					
					if(guessedLetter.equals(playersGuesses.get(i))) {
						
						
						System.out.println("Du har redan gissat p� denna bokstav, gissa p� en annan");
						playGame();
					}
					
					else{
					    playersGuesses.add(guessedLetter);
					}
				}
				
			
				for(int i = 0; i <wordToConvertToGuess.length() ; i++) {
				 
					 if (guessedLetter.equals(wordToGuess.get(i))){
						
						wordGuessedSoFar.set(i, guessedLetter);
						 
						System.out.println("Bra, du gissade r�tt");
						
						System.out.println("Det h�r �r det du gissat hittils");
						System.out.println(wordGuessedSoFar);
						checkIfWordIsDone();
						
						
						
						
					}
					 
					 
					 else if (guessedLetter.equals(wrongGuesses.get(i))){
						System.out.println(wrongGuesses);
						
					}
					else {
						
						guessesLeft --;
						System.out.println("Tyv�rr du gissade fel");
						
						if (guessesLeft == 0) {
							System.out.println("Tyv�rr, du f�rlorade, du lyckades inte gissa ordet");
							System.out.println("ordet var" + wordToGuess);
							playAgain();
						}
						
						
						else{
							System.out.println("du har nu" + guessesLeft + "kvar");
							System.out.println("Det h�r �r det du gissat hittils");
							System.out.println(wordGuessedSoFar);
							System.out.println("F�rs�k en g�ng till");
							playGame();
						break;
					}
			}
				
		}
			}
				
			
			
			
			/**
			 * Ska kolla om ordet �r klart eller inte
			 */
				public static void checkIfWordIsDone() {
					String Ester = "_";
					boolean Isacson = false;
					for(int i = 0; i < wordGuessedSoFar.size(); i++) {
						if(!(Ester.equals(wordGuessedSoFar.get(i))));
						Isacson = true;
					}
					
					if (Isacson == true) {

					System.out.println("Grattis, du gissade r�tt ord");
					playAgain();
					}
					
					else {
						System.out.println("Gissa p� en ny bokstav");
						playGame();
				}
				
			}
				
			/**
			 * n�r spelaren har vunnit eller f�rlorat ska man kunna v�lja att spela igen eller inte. 
			 */
			public static void playAgain() {
				System.out.println("Vill du spela igen?");
				System.out.println("Tryck 1. f�r NEJ");
				System.out.println("Tryck 2. f�r JA");
				System.out.println("tryck 3 f�r att byta sv�righetsgrad");
				
				if (chooseAgain == 1) {
					
				}
					else if (chooseAgain == 2) {
						clearLists();
						playGame();
					}
					else if (chooseAgain == 3) {
						clearLists();
						startGame();
				}
			}
	}
}
