package wordleGamePackage;

public class ExitView {

	boolean gameWon;
	boolean gameLost;
	
	
	/**CTOR for Exit View so other classes can call this class, and then this
	 * constructor will call all of the necessary methods if the game has been won or lost.
	 * 
	 * @param gameWon true if won, else false
	 * @param gameLost true if lost, else false.
	 * @author zachp
	 */
	public ExitView(boolean gameWon, boolean gameLost) {
		this.gameWon = gameWon;
		this.gameLost = gameLost;
		
		if (gameWon) //call the winning display if the game is won.
		{
			printWinLoseToTxtFile(gameWon);
			updateDisplayWinScreen(gameWon);
		}
		
		if (gameLost) //call the losing display if gameLost.
		{
			printWinLoseToTxtFile(gameLost);
			updateDisplayLoseScreen(gameLost);
		}
		
	}
	
	private void updateDisplayWinScreen(boolean gameWon) 
	{
		//TODO Zach add functionality that displays the Game Win Screen image. 
	}
	
	private void updateDisplayLoseScreen(boolean gameLost) 
	{
		//TODO Zach add functionality that displays the Game Lose Screen image.
	}
	
	private String printWinLoseToTxtFile(boolean gameResults) 
	{
		//TODO Zach add functionality that outputs whether the player won or lost to a Text File.
		return "";
	}
}
