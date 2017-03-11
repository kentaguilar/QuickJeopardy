import Models.Play;
import Models.QuestionAnswer;
import javax.swing.JButton;

public class Common 
{
	Play[] plays = new Play[4];
	String[] categories = { "Sports", "Science", "History", "Math" };	
	
	public void setPlay()
	{			
		plays[0] = new Play(categories[0], this.SetQuestionAnswer(categories[0]), new JButton(categories[0]));
		plays[1] = new Play(categories[1], this.SetQuestionAnswer(categories[1]), new JButton(categories[1]));
		plays[2] = new Play(categories[2], this.SetQuestionAnswer(categories[2]), new JButton(categories[2]));
		plays[3] = new Play(categories[3], this.SetQuestionAnswer(categories[3]), new JButton(categories[3]));
	}
	
	public QuestionAnswer[] SetQuestionAnswer(String categoryName)
	{
		QuestionAnswer[] questionAnswers = new QuestionAnswer[5];
		if(categoryName == categories[0])
		{
			questionAnswers[0] = new QuestionAnswer("Frankie Fredericks represented which African country in athletics?", "namibia", 100);
			questionAnswers[1] = new QuestionAnswer("In inches, how big is the diameter of a basketball hoop?", "18", 200);
			questionAnswers[2] = new QuestionAnswer("Kareem Abdul-Jabbar played 20 seasons in which sport?", "basketball", 300);
			questionAnswers[3] = new QuestionAnswer("Wladimir Klitschko is a champion boxer from which country?", "ukraine", 400);
			questionAnswers[4] = new QuestionAnswer("What was banned from 1967 to 1976?", "slamdunk", 500);
		}
		else if (categoryName == categories[1])
		{
			questionAnswers[0] = new QuestionAnswer("Celsius and Fahrenheit show the same temperature at", "40", 100);
			questionAnswers[1] = new QuestionAnswer("Hasdo Valley in Chhattisgarh is famous for  ", "coal mines", 200);
			questionAnswers[2] = new QuestionAnswer("Special Theory of Relative was proposed in", "1905", 300);
			questionAnswers[3] = new QuestionAnswer("The disease bronchitis is associated with:", "lungs", 400);
			questionAnswers[4] = new QuestionAnswer("Which is the alkalodid that contains in cola drinks?", "caffeine", 500);
		}
		else if (categoryName == categories[2])
		{
			questionAnswers[0] = new QuestionAnswer("Celsius and Fahrenheit show the same temperature at", "40", 100);
			questionAnswers[1] = new QuestionAnswer("Hasdo Valley in Chhattisgarh is famous for  ", "coal mines", 200);
			questionAnswers[2] = new QuestionAnswer("Special Theory of Relative was proposed in", "1905", 300);
			questionAnswers[3] = new QuestionAnswer("The disease bronchitis is associated with:", "lungs", 400);
			questionAnswers[4] = new QuestionAnswer("Which is the alkalodid that contains in cola drinks?", "caffeine", 500);
		}
		else if (categoryName == categories[3])
		{
			questionAnswers[0] = new QuestionAnswer("Celsius and Fahrenheit show the same temperature at", "40", 100);
			questionAnswers[1] = new QuestionAnswer("Hasdo Valley in Chhattisgarh is famous for  ", "coal mines", 200);
			questionAnswers[2] = new QuestionAnswer("Special Theory of Relative was proposed in", "1905", 300);
			questionAnswers[3] = new QuestionAnswer("The disease bronchitis is associated with:", "lungs", 400);
			questionAnswers[4] = new QuestionAnswer("Which is the alkalodid that contains in cola drinks?", "caffeine", 500);
		}
		
		return questionAnswers;
	}
	
	public Play[] getPlay()
	{
		return plays;
	}
}
