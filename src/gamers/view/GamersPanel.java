package gamers.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import gamers.controller.GuideController;

public class GamersPanel extends JPanel
{
	private GuideController baseController;
	private JTable gamesTable;
	private JLabel appLabel;
	private SpringLayout baseLayout;
	private JScrollPane tablePane;
	private TableCellWrapRenderer myCellRender;
	
	public GamersPanel(GuideController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		appLabel = new JLabel("Look!  2D!");
		myCellRender = new TableCellWrapRenderer();
		
		setupTable();
		setupPanel();
		setupLayout();
		heyListen();
	}
	
	private void setupTable()
	{
		String[] colHeader = { "Column 1", "Column 2" };
		gamesTable = new JTable(new DefaultTableModel(baseController.getMyGames(), colHeader));
		tablePane = new JScrollPane(gamesTable);
		
		for (int col = 0; col < gamesTable.getColumnCount(); col++)
		{
			gamesTable.getColumnModel().getColumn(col).setCellRenderer(myCellRender);
		}
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(appLabel);
		this.add(tablePane);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, appLabel, -401, SpringLayout.EAST, this);
	}
	
	private void heyListen()
	{
		
	}
}