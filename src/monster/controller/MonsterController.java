package monster.controller;
import java.util.Scanner;
import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;

public class MonsterController 
{
	private MonsterDisplay popup;
	public MonsterController()
	{
		//creates a MonsterDisplay object called popup
		popup = new MonsterDisplay();
	}
	public void start() 
	{
//		for (int i = 1; i <= 100; i++)
//		{
//			for(int j = 0; j < i; j++)
//			{
//				System.out.println(i);
//			}
//		}
//		for (int i = 100; i > 0; i--)
//		{
//			popup.displayText("Click me " + i + " more times to get rid of me");
//			if (i == 1)
//			{
//				i = 100;
//				popup.displayText("Just kidding! You are back at 100");
//			}
//		}
		
		MarshmallowMonster Albert = new MarshmallowMonster("Albert", 6, 6, 0, true);
		popup.displayText(Albert.toString());
		popup.displayText("Tyler is hungry. He is going to eat two arms!");
		Albert.setArmCount(Albert.getArmCount() - 2);
		popup.displayText(Albert.toString());
		interactWithMonster(Albert);
	}
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		//EAT ARMS
		popup.displayText(currentMonster.getName() + " wants to know what to eat next. He suggests arms, He has " + currentMonster.getArmCount() + " arms.");
		String unconverted = popup.getResponse("How many do you want to eat?");
		//Make sure it's an integer
		while (!isValidInteger(unconverted))
		{
			popup.displayText("TRY AGAIN.");
			unconverted = popup.getResponse("How many arms do you want to eat?!");
		}
		int consumed = Integer.parseInt(unconverted);
		
		//Give the response based on whether it's negative, 0, too big, or just right
		if (consumed < 0)
		{
			popup.displayText(currentMonster.getName() + " is confused by your negative number and eats your arms instead.");
		}
		else if (consumed == 0)
		{
			popup.displayText(currentMonster.getName() + " is sad because you didn't want to eat him. You ungrateful human.");
		}
		else if (consumed > currentMonster.getArmCount())
		{
			popup.displayText("That is impossible. He only has " + currentMonster.getArmCount() + " arms. You greedy human.");
		}
		else 
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			popup.displayText("He only has " + currentMonster.getArmCount() +  " arms left. You are the real monster.");
		}
		
		//EAT EYES	
		popup.displayText("Now eat his eyes. " + currentMonster.getName() + " wants to know how many of his " + currentMonster.getEyeCount() + " eyes you will eat.");
		consumed = 0;
		unconverted = popup.getResponse("How many do you want to eat?");
		//Make sure it's an integer
		while(!isValidInteger(unconverted))
		{
			popup.displayText("TRY AGAIN.");
			unconverted = popup.getResponse("How many eyes do you want to eat");
		}
		consumed = Integer.parseInt(unconverted);
		
		//Give the response based on whether it's negative, 0, too big, or just right
		if (consumed > 0) 
		{
			if (currentMonster.getEyeCount() >= consumed) 
			{
				currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
				popup.displayText(currentMonster.getName() + " has " + currentMonster.getEyeCount() + " eyes left. You are the real monster.");
			}
			else 
			{
				popup.displayText("That is impossible. He only has " + currentMonster.getEyeCount() +  " eyes. You greedy human.");
			}
		}
		else if(consumed == 0)
		{
			popup.displayText(currentMonster.getName() + " is sad because you didn't want to eat him. You ungrateful human.");
		}
		else
		{
			popup.displayText(currentMonster.getName() + " is confused by your negative number and eats your eyes instead.");
		}
		popup.displayText("THE CAKE IS A LIE\nTHE CAKE IS A LIE\nTHE CAKE IS A LIE");
		String answer = popup.getResponse("How much cake have you eaten today?");
		popup.displayText(answer + "!? That is a lot of cake!");
	}
	private boolean isValidInteger(String sample) 
	{
		boolean valid = false;
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only integer values are valid: " + sample + " is not a valid integer.");
		}
		return valid;
	}
	private boolean isValidDouble(String sample) 
	{
		boolean valid = false;
		try {
			Double.parseDouble(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only double (AKA number) values are valid: " + sample + " is not a valid double.");
		}
		return valid;
	}
}
