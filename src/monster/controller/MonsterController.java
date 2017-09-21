package monster.controller;
import java.util.Scanner;
import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;

public class MonsterController 
{
	private MonsterDisplay popup;
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	public void start() 
	{
		MarshmallowMonster Albert = new MarshmallowMonster("Albert", 6, 6, 0, true);
//		System.out.println(Albert);
		popup.displayText(Albert.toString());
//		System.out.println("Tyler is hungry. He is going to eat two arms");
		popup.displayText("Tyler is hungry. He is going to eat two arms!");
		Albert.setArmCount(Albert.getArmCount() - 2);
//		System.out.println(Albert + "\n");
		popup.displayText(Albert.toString());
		interactWithMonster(Albert);
	}
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		//ARMS eaten
//		System.out.println(currentMonster.getName() + " wants to know what to eat next.");
//		System.out.println(currentMonster.getName() + " suggests arms. He has " + currentMonster.getArmCount() + " arms!");
		popup.displayText(currentMonster.getName() + " wants to know what to eat next. He suggests arms, He has " + currentMonster.getArmCount() + " arms.");
//		System.out.println("How many do you want to eat?");
//		Scanner input = new Scanner(System.in);
//		int consumed = input.nextInt();
		String unconverted = popup.getResponse("How many do you want to eat?");
		int consumed = 0;
		if (isValidInteger(unconverted)) 
		{
			consumed = Integer.parseInt(unconverted);
		}
		
		if (consumed < 0)
		{
//			System.out.println(currentMonster.getName() + " is confused by your negative number and eats your arms instead.");
			popup.displayText(currentMonster.getName() + " is confused by your negative number and eats your arms instead.");
		}
		else if (consumed == 0)
		{
//			System.out.println(currentMonster.getName() + " is sad because you didn't want to eat him. You ungrateful human.");
			popup.displayText(currentMonster.getName() + " is sad because you didn't want to eat him. You ungrateful human.");
		}
		else if (consumed > currentMonster.getArmCount())
		{
//			System.out.println("That is impossible. He only has " + currentMonster.getArmCount() + " arms. You greedy human.");
			popup.displayText("That is impossible. He only has " + currentMonster.getArmCount() + " arms. You greedy human.");
		}
		else 
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
//			System.out.println("He only has " + currentMonster.getArmCount() +  " arms left. You are the real monster.");
			popup.displayText("He only has " + currentMonster.getArmCount() +  " arms left. You are the real monster.");
		}
		
		//EYES eaten
		
//		System.out.println("Now eat his eyes. " + currentMonster.getName() + " wants to know how many of his " + currentMonster.getEyeCount() + " eyes you will eat?");
		popup.displayText("Now eat his eyes. " + currentMonster.getName() + " wants to know how many of his " + currentMonster.getEyeCount() + " eyes you will eat.");
//		consumed = input.nextInt();
		consumed = 0;
		unconverted = popup.getResponse("How many do you want to eat?");
		if(isValidInteger(unconverted))
		{
			consumed = Integer.parseInt(unconverted);
		}
		if (consumed > 0) 
		{
			if (currentMonster.getEyeCount() >= consumed) 
			{
				currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
//				System.out.println(currentMonster.getName() + " has " + currentMonster.getEyeCount() + " eyes left. You are the real monster.");
				popup.displayText(currentMonster.getName() + " has " + currentMonster.getEyeCount() + " eyes left. You are the real monster.");
			}
			else 
			{
//				System.out.println("That is impossible. He only has " + currentMonster.getEyeCount() +  " eyes. You greedy human.");
				popup.displayText("That is impossible. He only has " + currentMonster.getEyeCount() +  " eyes. You greedy human.");
			}
		}
		else if(consumed == 0)
		{
//			System.out.println(currentMonster.getName() + " is sad because you didn't want to eat him. You ungrateful human.");
			popup.displayText(currentMonster.getName() + " is sad because you didn't want to eat him. You ungrateful human.");
		}
		else
		{
//			System.out.println(currentMonster.getName() + " is confused by your negative number and eats your eyes instead.");
			popup.displayText(currentMonster.getName() + " is confused by your negative number and eats your eyes instead.");
		}
		popup.displayText("THE CAKE IS A LIE\nTHE CAKE IS A LIE\nTHE CAKE IS A LIE");
		String answer = popup.getResponse("How much cake have you eaten today?");
//		System.out.println(answer);
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
