package Models;

public class QuestionAnswer {
	public String question;
	public String answer;
	public int points;
	public boolean isAnswered = false;
	
	public QuestionAnswer(String question, String answer, int points)
	{
		this.question = question;
		this.answer = answer;
		this.points = points;
	}
}
