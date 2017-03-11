import javax.swing.*;

import Models.Play;
import Models.Player;

import java.awt.*;
import java.util.Random;

public class Jeopardy extends JFrame 
{
	JButton[][] buttons = new JButton[6][3];
	JLabel[][] labels = new JLabel[1][2];
	String[] playersNames = { "John", "Stacy", "Me" };
	
	JPanel gamePanel = new JPanel();
	JPanel playerPanel = new JPanel();
	JPanel mainPanel = new JPanel();
	
	public Jeopardy()
	{		
		setTitle("Jeopardy App");
		setSize(350, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		gamePanel.setLayout(new GridLayout(6,3));
		playerPanel.setLayout(new GridLayout(3, 1));
		
		gamePanel.setPreferredSize(new Dimension(350, 350));
		
		mainPanel.add(playerPanel, BorderLayout.NORTH);
		mainPanel.add(gamePanel, BorderLayout.SOUTH);			
		
		setContentPane(mainPanel);
		
		setupLayout();
		setVisible(true);
	}	
	
	public void setupLayout()
	{		
		//setup players
		Player[] players = new Player[playersNames.length];		
		for(int i = 0; i < playersNames.length; i++)
		{			
			players[i] = new Player(playersNames[i], new JLabel(playersNames[i] + ": 0"));
			if(playersNames[i].equals("Me"))
			{
				players[i].isBot = false;
			}
			else
			{
				players[i].isBot = true;
			}
			
			playerPanel.add(players[i].playerLabel);
		}
		
		//setup play
		Common common = new Common();	
		common.setPlay();
		
		Play[] plays = common.getPlay();
		
		for(int i = 0; i < 2; i++)
		{
			labels[0][i] = new JLabel(plays[i].name);
			labels[0][i].setHorizontalAlignment(JLabel.CENTER);
			labels[0][i].setVerticalAlignment(JLabel.CENTER);
			gamePanel.add(labels[0][i]);
		}
				
		for(int x = 1; x < 6; x++)
		{
			for(int i = 0; i < 2; i++)
			{
				buttons[x][i] = new JButton("$" + Integer.toString(plays[i].questionAnswers[x-1].points)); 
				buttons[x][i].addActionListener(new QuestionListener(plays[i].name, plays[i].questionAnswers[x-1], plays, players));				
				gamePanel.add(buttons[x][i]);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		new Jeopardy();
	}
}
