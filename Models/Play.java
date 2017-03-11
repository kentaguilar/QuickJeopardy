package Models;

import javax.swing.JButton;

public class Play {
	public String name;
	public QuestionAnswer[] questionAnswers;
	JButton button;
	
	public Play(String name, QuestionAnswer[] questionAnswers, JButton button) {
		this.name = name;
		this.questionAnswers = questionAnswers;
		this.button = button;
	}
	
	public String toString() {
		return name;
	}
}
