package monster.view;

import javax.swing.JOptionPane;
//Displays text on popups
public class MonsterDisplay 
{
	
	public void displayText(String text)
	{
		JOptionPane.showMessageDialog(null, text);
	}

	public String getResponse(String questionAsked)
	{
		String response = "";	
		response += JOptionPane.showInputDialog(null, questionAsked);
		return response;
	}
}