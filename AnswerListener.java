import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AnswerListener implements ActionListener
{
	JTextField givenAnswer;
	JButton currentButton;
	JFrame questionFrame;
	String correctAnswer;
	String currentPlayer;
	
	public AnswerListener(JTextField givenAnswer, String correctAnswer, String currentPlayer, JButton currentButton, JFrame questionFrame)
	{
		this.givenAnswer = givenAnswer;
		this.correctAnswer = correctAnswer;
		this.currentPlayer = currentPlayer;
		this.currentButton = currentButton;
		this.questionFrame = questionFrame;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String answerResult = "Sorry " + this.currentPlayer + ", your answer is incorrect";
		if(givenAnswer.getText().equals(this.correctAnswer))
		{
			answerResult = "Congratulations " + this.currentPlayer + ", your answer is correct!";
			this.currentButton.setEnabled(false);
			questionFrame.setVisible(false);
			questionFrame.dispose();
		}		
		
		JOptionPane.showMessageDialog(null, answerResult, "Result", JOptionPane.PLAIN_MESSAGE);
	}
}
