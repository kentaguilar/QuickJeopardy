import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import Models.Player;
import Models.Play;
import Models.QuestionAnswer;

public class AnswerListener implements ActionListener
{
	JTextField givenAnswer;
	JButton currentButton;
	JFrame questionFrame;
	String correctAnswer;
	Player currentPlayer;
	Play[] currentPlays;
	Player[] currentPlayers;
	QuestionAnswer questionAnswer;
	
	public AnswerListener(JTextField givenAnswer, QuestionAnswer questionAnswer, Player currentPlayer, JButton currentButton, 
			JFrame questionFrame, Play[] plays, Player[] players)
	{
		this.givenAnswer = givenAnswer;
		this.questionAnswer = questionAnswer;
		this.currentPlayer = currentPlayer;
		this.currentButton = currentButton;
		this.questionFrame = questionFrame;
		this.currentPlays = plays;
		this.currentPlayers = players;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String answerResult = "Sorry " + this.currentPlayer.name + ", your answer is incorrect";
		boolean isAnsweredAll = true;
		
		if(givenAnswer.getText().equals(this.questionAnswer.answer.toLowerCase()))
		{
			answerResult = this.currentPlayer.name + ", your answer is correct!";
			this.currentPlayer.score = this.currentPlayer.score + questionAnswer.points;			
			this.currentPlayer.playerLabel.setText(this.currentPlayer.name + ": " + Integer.toString(this.currentPlayer.score));
			this.questionAnswer.isAnswered = true;
			
			//check status of questions			
			for(int i = 0; i < 2; i++)
			{
				for(int x = 0; x < currentPlays[i].questionAnswers.length; x++)
				{
					if(!currentPlays[i].questionAnswers[x].isAnswered)
					{
						isAnsweredAll = false;
					}
				}
			}						
			
			this.currentButton.setEnabled(false);			
		}		
		else
		{
			isAnsweredAll = false;
		}
		
		questionFrame.setVisible(false);
		questionFrame.dispose();
		
		JOptionPane.showMessageDialog(null, answerResult, "Result", JOptionPane.PLAIN_MESSAGE);		
		
		if(isAnsweredAll)
		{
			Player winner = new Player();
			for(Player player: this.currentPlayers)
			{
				 if(player.score > winner.score)
				 {
					winner = player;
				 }
			}
			
			JOptionPane.showMessageDialog(null, "Congratulations " + winner.name + ", you are the winner!", "Game Winner", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
