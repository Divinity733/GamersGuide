package gamers.view;

import javax.swing.JFrame;

import gamers.controller.GuideController;

public class GamersFrame extends JFrame
{
	private GamersPanel appPanel;
	
	public GamersFrame(GuideController baseController)
	{
		appPanel = new GamersPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500, 500);
		this.setContentPane(appPanel);
		this.setVisible(true);
	}
}
