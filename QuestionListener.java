import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import Models.QuestionAnswer;

public class QuestionListener implements ActionListener
{
	QuestionAnswer currentQuestionAnswer;
	String categoryName;
	
	public QuestionListener(String categoryName, QuestionAnswer questionAnswer)
	{
		this.categoryName = categoryName;
		this.currentQuestionAnswer = questionAnswer;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		new GameWindow().showGameWindow(this.categoryName, this.currentQuestionAnswer, (JButton)e.getSource());
	}
}