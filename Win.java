package wordleGamePackage;

/*
 * Need a object of class win to access the functionality found within Win class.
 */

/**Compares guessed word to correctWord to see if the player guessed correctly. 
 * 
 * @author zachp
 *
 */
public class Win {
	
	String word;
	char[] lettersPlayedinRound;
	
	
	/**CTOR Called by Game class to create a Win object. Added CTOR because allows game to access
	 * callWin() and other methods.
	 * 
	 * @param correctWord passed in as parameter from Game class
	 * @param guessedWord passed in as parameter from Game class
	 */
	public Win(String correctWord, char[] guessedWord) {
		this.word = correctWord;
		this.lettersPlayedinRound = guessedWord;
	}


	/**Uses for loop and if statements to determine whether or not the guessed word matches the hidden word. 
	 * 
	 * @return true or false boolean based on guess accuracy.
	 * @author zachp
	 */
	public boolean hasPlayerWon() //FIXME this method is supposed to have the hidden wordle word as a parameter
	{	
		char[] correctWord = word.toCharArray(); //converts the correct word into a char array
		//FIXME THIS IS JUST PRINTING THE CORRECT WORD, NOT WHAT THE USER GUESSED. 
		String printString = new String(lettersPlayedinRound);
		System.out.println(word + "\n" + printString);
		
		if(lettersPlayedinRound.length == 5)//if the guessed word somehow has too many letters, the program should return false.
		{
			for (int i = 0; i < 5; i++) //loops 5 times, for 5 letters of each word.
			{
				if (correctWord[i] == lettersPlayedinRound[i]) //if letters of each word at index i match
				{
					//do nothing. Allow the for loop to continue iterating.
				}else 
				{
					System.out.println("FALSE");
					//callGameViewIfNotWon();
					//TODO call the callGameViewIfNotWon() method because the game is still going.
					return false; //if any of the letters don't match, return false.
				}
			}
			System.out.println("TRUE");
			//callExitView();
			//TODO call the callExitView() method because the game has been won.
			return true; //this code can only be reached if the if-statement in the for-loop did not return false. Ie: returns true if words match
		}
		else
		{
			System.out.println("FALSE");
			//callGameViewIfNotWon();
			//TODO call the callGameViewIfNotWon() method because the game is still going.
			return false;
		}
	}
	
	
	private void callExitView() //I think that ExitView needs a constructor so we can access functionality found within, and to call the class.
	{
		ExitView winExit = new ExitView(hasPlayerWon(), false); //calls ExitView constructor. Assumes gameLost param is false
		//Lose class will be responsible for telling ExitView if the player has lost
	}
	
	private boolean callGameIfNotWon()
	{
		//TODO Zach implement method
		
		return false;
	}
	
	
}
