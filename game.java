package wordleGamePackage;

import java.util.Scanner;

public class game {

	String word;
	char[] lettersPlayed;
	boolean rightPlaceRightLetter;
	boolean wrongPlaceRightLetter;
	boolean wrongPlaceWrongLetter;
	int currentRound = 0; 
	
	/**Constructor
	 * 
	 * @param word initializes 'word' with the hidden-Wordle-word
	 */
	public game (String word) // This is the constructor.
	{ 
		this.word = word;
	}
	
	public char[] readTxtFile() 
	{
		//Mujib TODO read the characters in the Text file
		return null;
	}
	
	public char[] readWordInput(int currentRound)
	{
		String charInput = ""; 
		char[][] fiveLetters = new char[6][5];
		Scanner scanner = new Scanner(System.in);
		while (charInput.length()!=5) //Prompts player for 5-letter word until one is entered. 
		{
			System.out.println("Please Enter a 5-letter word: ");
			charInput = scanner.nextLine();
		}
		
		for (int i = 0; i < 5; i ++)
		{
			fiveLetters[currentRound][i] = charInput.charAt(i) ; 
		}
		
		return fiveLetters[currentRound];
		
	}
	
	
	/**Creates an object of class Win to access the hasPlayerWon() method. 
	 * 
	 * @param String word is the hidden correct wordle word
	 * @param char[] lettersPlayedInRound is the player's guessed letters for that round.
	 *  
	 */
	public void callWin(String word, char[] lettersPlayedInRound)//String word, char[] lettersPlayedinRound)
	{
		Win winObject = new Win(word, lettersPlayedInRound); //creates a win object to access Win class methods. 
		winObject.hasPlayerWon(); //Win class handles whether or not the guessed word matches the hidden word.
		//I think it may be better to have this method return a boolean. 
	}
	
	/**Creates an object of class Lose to access the methods within. 
	 * 
	 * @param word the correct, hidden, wordle word
	 * @param lettersPlayedinRound the letters guessed by the player.
	 */
	public void callLose(String word, char[] lettersPlayedinRound)
	{
		Lose loseObject = new Lose(word, lettersPlayedinRound);
		loseObject.hasPlayerLost(word);
	}
	
//	public callGameView(char[] lettersPlayedinRound)
//	{
//		//Zach TODO 
//	}
//	
//	public exitView()
//	{
//		public class gameWon() 
//		{
//			return 0;//Zach TODO 
//		}
//		
//		public class gameLost() 
//		{
//			return 0;//Zach TODO 
//		}
//	}
//	
	public static void main(String[] args) {
		
		String gameWord = "Apple";
		char[] userInput; 
		int round = 0;
		boolean won= false;
		boolean lost= false;
		
		//gameWord = readTxtFile();
		
		game myGame = new game(gameWord); //constructs a game object initialized with a hidden wordle word "apple"
		System.out.println(myGame.word); //myGame is successfully initialized with the hardcoded hidden word. TODO read in hidden word from file.
		
		myGame.callWin(myGame.word, myGame.readWordInput(0));
		System.out.println("\n");
		
		myGame.callLose(myGame.word, myGame.readWordInput(0));
		
//		
//		while (won == false || lost == false)
//		{
//			userInput[round] = readWordInput(int round);
//			
//			callGameView(userInput[round]);
//			
//			won = callWin(gameWord, userInput[round]);
//			
//			lost = callLose(gameWord, userInput[round]);
//		}
//		
//		if (won = true)
//		{
//			exitView.gameWon();
//			System.exit(0);
//		}
//		
//		if (lost = true)
//		{
//			exitView.gameLost();
//			System.exit(0);
//		}
//		
//		
	}
}
