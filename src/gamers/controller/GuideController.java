package gamers.controller;

import gamers.model.GamersGuide;
import gamers.view.GamersFrame;

public class GuideController
{
	private GamersGuide[][] myGuide;
	private GamersFrame appFrame;
	
	public GuideController()
	{
		myGuide = new GamersGuide[3][3];
		gimmeMyGames();
		appFrame = new GamersFrame(this);
	}
	
	public GamersGuide[][] getMyGames()
	{
		return myGuide;
	}
	
	public GamersFrame getBaseFrame()
	{
		return appFrame;
	}
	
	private void gimmeMyGames()
	{
		GamersGuide myFavorite = new GamersGuide("Ocarina of Time", 1, true);
		myGuide[0][0] = myFavorite;
		
		for (int row = 0; row < myGuide.length; row++)
		{
			for (int col = 0; col < myGuide[0].length; col++)
			{
				if (myGuide[row][col] == null)
				{
					double numberOfPlayers = Math.random() * 5000;
					boolean isFun;
					if (((int) numberOfPlayers) % 45 == 17)
					{
						isFun = true;
					}
					else
					{
						isFun = false;
					}
					
					myGuide[row][col] = new GamersGuide("Random Game#" + (numberOfPlayers/3), numberOfPlayers, isFun);
				}
			}
		}
	}
	
	public void start()
	{
		
	}
}
