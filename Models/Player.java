package Models;
import javax.swing.JLabel;

public class Player {
	public String name;
	public int score;
	public JLabel playerLabel;
	public boolean isBot = false;
	
	public Player() 
	{
		this.name = "";
		this.score = 0;
	}
	
	public Player(String name, JLabel playerLabel)
	{
		this.name = name;
		this.playerLabel = playerLabel;
	}
}
