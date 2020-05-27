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
		
		public static void clearLists() {
			playersGuesses.clear();
			wrongGuesses.clear();
		}
		
		
	public static void startGame() {
		System.out.println("välkommen till hänga gubben");
		System.out.println("Ett ord kommer slumpas fram och det gäller för dig att gissa rätt på vilket ord det är");
		System.out.println("du ska nu få välja svårighetsgrad:");
		System.out.println("skriv 1 för lätt,");
		System.out.println("skriv 2 för medium");
		System.out.println("och 3 för svår");
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
			
			Random word = new Random();

		}

		public static void mediumWordsToGuess(){
			
		
			mediumWords = new ArrayList<String>();
			
			mediumWords.add("dator");
			mediumWords.add("hårsnodd");
			mediumWords.add("grav");
			mediumWords.add("galler");
			mediumWords.add("inlagd");
			mediumWords.add("förlåt");
			mediumWords.add("måttband");
			mediumWords.add("kyrka");
			mediumWords.add("maten");
			mediumWords.add("åsna");
			
			Random word = new Random();


		}
		
		public static void hardWordsToGuess(){
			
		
			hardWords = new ArrayList<String>();
			
			hardWords.add("jazz");
			hardWords.add("flaggstång");
			hardWords.add("extra");
			hardWords.add("vispgrädde");
			hardWords.add("croissanter");
			hardWords.add("nationalencyklopedin");
			hardWords.add("yatzy");
			hardWords.add("squash");
			hardWords.add("växjö");
			hardWords.add("ukulele");
			
			Random wordToConvertToGuess = new Random();

			
		}


			public static void easyLevel() {

				
				for(int i = 0; i< wordToConvertToGuess.length(); i++) {
					String e = String.valueOf(wordToConvertToGuess.charAt(i));
					wordToGuess.add(e);
				}
				
					System.out.println("ordet du ska gissa på är" + wordToConvertToGuess.length() + "bokstäver långt" );
			}
			
			public static void mediumLevel() {
				
				for(int i = 0; i< wordToConvertToGuess.length(); i++) {
					String e = String.valueOf(wordToConvertToGuess.charAt(i));
					wordToGuess.add(e);
				}
				
				
				System.out.println("ordet du ska gissa på är" + wordToConvertToGuess.length() + "bokstäver långt" );
			}
			

			public static void hardLevel() {
				
				for(int i = 0; i< wordToConvertToGuess.length(); i++) {
					String e = String.valueOf(wordToConvertToGuess.charAt(i));
					wordToGuess.add(e);
				}
				
				System.out.println("ordet du ska gissa på är" + wordToConvertToGuess.length() + "bokstäver långt" );
			}
			
			public static void makeWordToLines(int numberOfLetters) {
				
				for(int i = 0; i < numberOfLetters; i++) {
					wordGuessedSoFar.add("_");
					
					
				}
			}
			
			public static void playGame() {
			
				for(int i = 0; i <wordGuessedSoFar.size(); i++) {
					System.out.print(wordGuessedSoFar.get(i));
				}

				System.out.println("Gissa på en bokstav");
				Scanner guessedLetter = new Scanner(System.in);
				checkIfRight();
			}
			
			
			
			public static void checkIfRight() {
				for(int i = 0; i < playersGuesses.size(); i++) {
					
					if(guessedLetter.equals(playersGuesses.get(i))) {
						
						System.out.println("Du har redan gissat på denna bokstav, gissa på en annan");
						playGame();
					}
					
					else{
					    playersGuesses.add(guessedLetter);
					}
				}
				
			
				for(int i = 0; i <wordToConvertToGuess.length() ; i++) {
				 
					 if (guessedLetter.equals(wordToGuess.get(i)){
						
						System.out.println("Bra, du gissade rätt");
						System.out.println("Gissa på en ny bokstav");
						playGame();
					}
					 
					 else if (guessedLetter.equals(wrongGuesses.get(i))){
						System.out.println(wrongGuesses);
						
					}
					else {
						
						guessesLeft --;
						System.out.println("Tyvärr du gissade fel");
						
						if (guessesLeft == 0) {
							System.out.println("Tyvärr, du förlorade, du lyckades inte gissa ordet");
							System.out.println("ordet var" + wordToGuess);
							playAgain();
						}
						
						
						else{
							System.out.println("du har nu" + guessesLeft + "kvar");
							System.out.println("Försök en gång till");
							playGame();
						break;
					}
			}
				
		}
			public static void playAgain() {
				System.out.println("Vill du spela igen?");
				System.out.println("Tryck 1. för NEJ");
				System.out.println("Tryck 2. för JA");
				System.out.println("tryck 3 för att byta svårighetsgrad");
				
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
