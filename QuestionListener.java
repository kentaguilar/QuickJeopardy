import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import Models.QuestionAnswer;
import Models.Player;
import Models.Play;

public class QuestionListener implements ActionListener
{
	QuestionAnswer currentQuestionAnswer;
	String categoryName;
	Player currentPlayer;
	Play[] currentPlays;
	Player[] currentPlayers;
	
	public QuestionListener(String categoryName, QuestionAnswer questionAnswer, Play[] plays, Player[] players)
	{
		this.categoryName = categoryName;
		this.currentQuestionAnswer = questionAnswer;
		this.currentPlays = plays;
		this.currentPlayers = players;
	}
	
	public void actionPerformed(ActionEvent e)
	{				
		new GameWindow().showGameWindow(this.categoryName, this.currentQuestionAnswer, (JButton)e.getSource(), this.getRandomPlayer(this.currentPlayers), this.currentPlays, this.currentPlayers);
	}
	
	public Player getRandomPlayer(Player[] players)
	{
		int rnd = new Random().nextInt(players.length);
		return players[rnd];
	}
}