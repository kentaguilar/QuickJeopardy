import javax.swing.*;

import Models.Play;
import Models.Player;

import java.awt.*;
import java.util.Random;

public class Jeopardy extends JFrame 
{
	JButton[][] buttons = new JButton[6][3];
	JLabel[][] labels = new JLabel[1][2];
	String[] players = { "John", "Stacy", "Me" };
	
	public Jeopardy()
	{		
		setTitle("Jeopardy App");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(6,3));
		
		setupLayout();
		
		setVisible(true);
	}	
	
	public void setupLayout()
	{		
		//setup players
		Player[] currentPlayers = new Player[players.length];		
		for(int i = 0; i < players.length; i++)
		{
			currentPlayers[i] = new Player(players[i]);
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
			add(labels[0][i]);
		}
				
		for(int x = 1; x < 6; x++)
		{
			for(int i = 0; i < 2; i++)
			{
				buttons[x][i] = new JButton("$" + Integer.toString(plays[i].questionAnswers[x-1].points)); 
				buttons[x][i].addActionListener(new QuestionListener(plays[i].name, plays[i].questionAnswers[x-1]));				
				add(buttons[x][i]);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		new Jeopardy();
	}
}
