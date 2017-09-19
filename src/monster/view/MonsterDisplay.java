package monster.view;

import javax.swing.JOptionPane;

public class MonsterDisplay 
{
	
	public void displayText(String text)
	{
		JOptionPane.showMessageDialog(null, text);
	}
	public String getResponse(String textToDisplay)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, textToDisplay);
		
		return response;
	}
	
}
