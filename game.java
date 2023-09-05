package wordleGamePackage;

import java.util.Scanner;

public class game {

	String word;
	int currentRound = 0;
	
	public game (String word) // This is the constructor.
	{ 
		this.word = word;
	}
	
	public char[] readTxtFile() 
	{
		//Mujib TODO read the characters in the Text file
	}
	
	public char[] readWordInput(int currentRound)
	{
		String charInput = "";
		char[][] fiveLetters = new char[6][5];
		Scanner scanner = new Scanner(System.in);
		while (charInput.length()!=5)
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
	
	public callWin(String word, char[] lettersPlayedinRound)
	{
		//Zach TODO 
	}
	
	public callLose(String word, char[] lettersPlayedinRound)
	{
		//Zach TODO 
	}
	
	public callGameView(char[] lettersPlayedinRound)
	{
		//Zach TODO 
	}
	
	public exitView()
	{
		public class gameWon() 
		{
			return 0;//Zach TODO 
		}
		
		public class gameLost() 
		{
			return 0;//Zach TODO 
		}
	}
	
	public static void main(String[] args) {
		
		String gameWord = "";
		char[] userInput; 
		int round = 0;
		boolean won= false;
		boolean lost= false;
		
		gameWord = readTxtFile();
		
		game myGame = new game(gameWord);
		//System.out.println(myGame.word);
		
		while (won == false || lost == false)
		{
			userInput[round] = readWordInput(int round);
			
			callGameView(userInput[round]);
			
			won = callWin(gameWord, userInput[round]);
			
			lost = callLose(gameWord, userInput[round]);
		}
		
		if (won = true)
		{
			exitView.gameWon();
			System.exit(0);
		}
		
		if (lost = true)
		{
			exitView.gameLost();
			System.exit(0);
		}
		
		
	}
}

