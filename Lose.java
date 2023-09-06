package wordleGamePackage;

public class Lose {
	
	String word;
	char[] lettersPlayedinRound;
	
	
	/**CTOR Called by Game class to create a Lose object. Added CTOR because allows game to access
	 * callLose() and other methods.
	 * 
	 * @param word
	 * @param lettersPlayedinRound
	 */
	public Lose(String word, char[] lettersPlayedinRound) {
		this.word = word;
		this.lettersPlayedinRound = lettersPlayedinRound;
	}
	
	public boolean hasPlayerLost(String hiddenWord) //I'm not sure how to make the game function without having many of these methods be public. 
	{
		char[] correctWord = hiddenWord.toCharArray(); //converts the correct word into a char array 
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
		ExitView winExit = new ExitView(false, hasPlayerLost(this.word)); //calls ExitView constructor. Assumes gameWon param is false
		//Win class will be responsible for telling ExitView if the player has won.
	}
	
}
