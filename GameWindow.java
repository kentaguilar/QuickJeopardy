import java.awt.*;
import javax.swing.*;
import Models.QuestionAnswer;

public class GameWindow 
{
    public void showGameWindow(String categoryName, QuestionAnswer questionAnswer, JButton currentButton)
    {
        JFrame currentFrame = new JFrame(categoryName);
        JPanel contentPane = new JPanel();
        
        String currentPlayer = "John";
        
        //define elements
        JButton makeAnswerButton = new JButton("Answer Now");
        JTextField answerTextField = new JTextField();
        
        contentPane.setLayout(new GridLayout(4,1));  
        contentPane.add(new JLabel("Current Player: " + currentPlayer));
        contentPane.add(new JLabel(questionAnswer.question));
        contentPane.add(answerTextField);
        contentPane.add(makeAnswerButton);            
        
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setSize(800, 500);
        currentFrame.setContentPane(contentPane);
        
        currentFrame.pack();   
        currentFrame.setLocationByPlatform(true);
        currentFrame.setVisible(true);
        
        makeAnswerButton.addActionListener(new AnswerListener(answerTextField, questionAnswer.answer.toLowerCase(), 
        		currentPlayer, currentButton, currentFrame));
    }
}
