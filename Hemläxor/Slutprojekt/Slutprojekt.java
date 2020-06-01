import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Slutprojekt {
	
		public static int chooseWhichLevel;
		public static int guessesLeft;
		public static ArrayList<String> easyWords; 
		public static ArrayList<String> mediumWords;
		public static ArrayList<String> hardWords;
		public static String wordToConvertToGuess;
		public static ArrayList<String> wordToGuess = new ArrayList<String>();
		public static ArrayList<String> wordGuessedSoFar = new ArrayList<String>();
		public static Random word;
		public static String guessedLetter;
		public static ArrayList<String>playersGuesses = new ArrayList<String>();
		public static int chooseAgain;
		public static ArrayList<String> wrongGuesses = new ArrayList<String>();
		public static Scanner input = new Scanner(System.in);


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
		

	
	try {
		String tempString = input.nextLine();
		chooseWhichLevel = Integer.parseInt(tempString);
		
	}
	
	catch(NumberFormatException k) {
		System.out.println("Testa att skriva en siffra ist�llet");
		startGame();
		return;
	} 
		
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
			

		}
		/**
		 * en arraylist som lagrar orden f�r medelniv�n
		 */
		public static void mediumWordsToGuess(){
			
		
			mediumWords = new ArrayList<String>();
			
			mediumWords.add("dator");
			mediumWords.add("grav");
			mediumWords.add("galler");
			mediumWords.add("inlagd");
			mediumWords.add("kyrka");
			mediumWords.add("maten");
			


		}
		
		/**
		 * en arraylist som lagrar orden f�r den sv�ra niv�n
		 */
		public static void hardWordsToGuess(){
			
		
			hardWords = new ArrayList<String>();
			
			hardWords.add("jazz");
			hardWords.add("extra");
			hardWords.add("croissanter");
			hardWords.add("nationalencyklopedin");
			hardWords.add("yatzy");
			hardWords.add("squash");
			hardWords.add("ukulele");
			
		
			
		}

		/**
		 * Ska ta in ett v�rde fr�n easywords och skriva ut hur m�nga bokst�ver det �r i ordet.
		 */
			public static void easyLevel() {
				
				easyWordsToGuess();
				Random word = new Random();
				int index = word.nextInt(easyWords.size());
				wordToConvertToGuess = easyWords.get(index);
				
				for(int i = 0; i< wordToConvertToGuess.length(); i++) {
					String e = String.valueOf(wordToConvertToGuess.charAt(i));
					wordToGuess.add(e);
				}
				
				makeWordToLines();

				System.out.println("ordet du ska gissa p� �r " + wordToConvertToGuess.length() + " bokst�ver l�ngt" );
			}
			
			/**
			 * Ska ta in ett v�rde fr�n mediumwords och skriva ut hur m�nga bokst�ver det �r i ordet.
			 */
			public static void mediumLevel() {
				
				mediumWordsToGuess();
				Random word = new Random();
				int index = word.nextInt(mediumWords.size());
				wordToConvertToGuess = mediumWords.get(index);
				
				for(int i = 0; i< wordToConvertToGuess.length(); i++) {
					String e = String.valueOf(wordToConvertToGuess.charAt(i));
					wordToGuess.add(e);
				}
				
				makeWordToLines();
				
				System.out.println("ordet du ska gissa p� �r " + wordToConvertToGuess.length() + " bokst�ver l�ngt" );
			}
			
			/**
			 * Ska ta in ett v�rde fr�n hardwords och skriva ut hur m�nga bokst�ver det �r i ordet.
			 */
			public static void hardLevel() {
				
				hardWordsToGuess();
				Random word = new Random();
				int index = word.nextInt(hardWords.size());
				wordToConvertToGuess = hardWords.get(index);
				
				for(int i = 0; i< wordToConvertToGuess.length(); i++) {
					String e = String.valueOf(wordToConvertToGuess.charAt(i));
					wordToGuess.add(e);
				}
				makeWordToLines();
				
				System.out.println("ordet du ska gissa p� �r " + wordToConvertToGuess.length() + " bokst�ver l�ngt" );
			}
			
			/**
			 * ska skriva ut alla bokst�ver som linjer
			 * @param numberOfLetters en int f�r att h�lla nummer
			 */
			public static void makeWordToLines() {
				
				for(int i = 0; i < wordToConvertToGuess.length(); i++) {
					wordGuessedSoFar.add("_ ");
					
					
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
				guessedLetter = input.nextLine();		
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
						return;
					}
				}
				
				playersGuesses.add(guessedLetter);
				boolean ifRight = false;
				for(int i = 0; i <wordToGuess.size() ; i++) {
				 
					 if (guessedLetter.equals(wordToGuess.get(i))){


						ifRight = true;
					}
				}
				
				if (ifRight) {
					System.out.println("Bra, du gissade r�tt");
				
					System.out.println("Det h�r �r det du gissat hittils");
					System.out.println(wordGuessedSoFar);	
				}
				
				else {
					wrongGuesses.add(guessedLetter);
					System.out.println(wrongGuesses);
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
					}
					return;
				}
				
				checkIfWordIsDone();
				
			}
			
			
			
			/**
			 * Ska kolla om ordet �r klart eller inte
			 */
			public static void checkIfWordIsDone() {
				Character underscore = new  Character('_');
				boolean ifWrong = false;
				
				for(int i = 0; i < wordGuessedSoFar.size(); i++) {
					System.out.println(wordGuessedSoFar.get(i));

					if(underscore.equals(wordGuessedSoFar.get(i))) {

						ifWrong = true;
					}
				}
				
				if (ifWrong) {
					System.out.println("Gissa p� en ny bokstav");
					playGame();
					return;
				}
				
				else {
					System.out.println("Grattis, du gissade r�tt ord");
					playAgain();
					return;
					
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
				
				try {
					chooseAgain = input.nextInt();
				}
				catch(InputMismatchException k) {
					System.out.println("Testa att skriva en siffra ist�llet");
					playAgain();

				}
				
				
				 if (chooseAgain == 1) {
					System.exit(0);
					
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

