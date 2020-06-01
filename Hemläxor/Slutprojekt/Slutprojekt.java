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
		
		
		//raderar allt som finns i listorna med lagrade gissningar så att det inte blir något konstigt sen när spelet startas igen via playgame
		public static void clearLists() {
			playersGuesses.clear();
			wrongGuesses.clear();
		}
		
		/**
		 * startar spelet och låter en välja svårighetsgrad som man vill spela
		 */
	public static void startGame() {
		System.out.println("välkommen till hänga gubben");
		System.out.println("Ett ord kommer slumpas fram och det gäller för dig att gissa rätt på vilket ord det är");
		System.out.println("du ska nu få välja svårighetsgrad:");
		System.out.println("skriv 1 för lätt,");
		System.out.println("skriv 2 för medium");
		System.out.println("och 3 för svår");
		

	
	try {
		String tempString = input.nextLine();
		chooseWhichLevel = Integer.parseInt(tempString);
		
	}
	
	catch(NumberFormatException k) {
		System.out.println("Testa att skriva en siffra istället");
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
		 * en arraylist som lagrar orden för den lätta nivån
		 */
		public static void easyWordsToGuess(){
			
			easyWords = new ArrayList<String>();
		
			easyWords.add("naglar");
			easyWords.add("händer");
			easyWords.add("kommer");
			easyWords.add("mycket");
			easyWords.add("sverige");
			easyWords.add("england");
			easyWords.add("trilla");
			easyWords.add("klass");
			easyWords.add("sill");
			

		}
		/**
		 * en arraylist som lagrar orden för medelnivån
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
		 * en arraylist som lagrar orden för den svåra nivån
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
		 * Ska ta in ett värde från easywords och skriva ut hur många bokstäver det är i ordet.
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

				System.out.println("ordet du ska gissa på är " + wordToConvertToGuess.length() + " bokstäver långt" );
			}
			
			/**
			 * Ska ta in ett värde från mediumwords och skriva ut hur många bokstäver det är i ordet.
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
				
				System.out.println("ordet du ska gissa på är " + wordToConvertToGuess.length() + " bokstäver långt" );
			}
			
			/**
			 * Ska ta in ett värde från hardwords och skriva ut hur många bokstäver det är i ordet.
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
				
				System.out.println("ordet du ska gissa på är " + wordToConvertToGuess.length() + " bokstäver långt" );
			}
			
			/**
			 * ska skriva ut alla bokstäver som linjer
			 * @param numberOfLetters en int för att hålla nummer
			 */
			public static void makeWordToLines() {
				
				for(int i = 0; i < wordToConvertToGuess.length(); i++) {
					wordGuessedSoFar.add("_ ");
					
					
				}
			}
			
			/**
			 * själva spelet där man gissar på en bokstav
			 */
			public static void playGame() {
			
				for(int i = 0; i <wordGuessedSoFar.size(); i++) {
					System.out.print(wordGuessedSoFar.get(i));
				}

				System.out.println("Gissa på en bokstav");
				guessedLetter = input.nextLine();		
				checkIfRight();
			}
			
			
			/**
			 * ska kolla om spelarens gissning är rätt eller inte och hur många gissningar det är kvar
			 */
			public static void checkIfRight() {
				for(int i = 0; i < playersGuesses.size(); i++) {
					
					if(guessedLetter.equals(playersGuesses.get(i))) {
						System.out.println("Du har redan gissat på denna bokstav, gissa på en annan");
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
					System.out.println("Bra, du gissade rätt");
				
					System.out.println("Det här är det du gissat hittils");
					System.out.println(wordGuessedSoFar);	
				}
				
				else {
					wrongGuesses.add(guessedLetter);
					System.out.println(wrongGuesses);
					guessesLeft --;
					System.out.println("Tyvärr du gissade fel");
					
					if (guessesLeft == 0) {
						System.out.println("Tyvärr, du förlorade, du lyckades inte gissa ordet");
						System.out.println("ordet var" + wordToGuess);
						playAgain();
					}
					
					else{
						System.out.println("du har nu" + guessesLeft + "kvar");
						System.out.println("Det här är det du gissat hittils");
						System.out.println(wordGuessedSoFar);
						System.out.println("Försök en gång till");
						playGame();
					}
					return;
				}
				
				checkIfWordIsDone();
				
			}
			
			
			
			/**
			 * Ska kolla om ordet är klart eller inte
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
					System.out.println("Gissa på en ny bokstav");
					playGame();
					return;
				}
				
				else {
					System.out.println("Grattis, du gissade rätt ord");
					playAgain();
					return;
					
				}
			}

			/**
			 * när spelaren har vunnit eller förlorat ska man kunna välja att spela igen eller inte. 
			 */
			public static void playAgain() {
				System.out.println("Vill du spela igen?");
				System.out.println("Tryck 1. för NEJ");
				System.out.println("Tryck 2. för JA");
				System.out.println("tryck 3 för att byta svårighetsgrad");
				
				try {
					chooseAgain = input.nextInt();
				}
				catch(InputMismatchException k) {
					System.out.println("Testa att skriva en siffra istället");
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

