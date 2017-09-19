package monster.controller;
import java.util.Scanner;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	public void start() 
	{
		/*
		MarshmallowMonster sample = new MarshmallowMonster();
		System.out.println(sample);
		*/
		
		MarshmallowMonster Albert = new MarshmallowMonster("Albert", 6, 6, 0, true);
		System.out.println(Albert);
		System.out.println("Tyler is hungry. He is going to eat two arms");
		Albert.setArmCount(Albert.getArmCount() - 2);
		System.out.println(Albert + "\n");
		interactWithMonster(Albert);
	}
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		//ARMS eaten
		System.out.println(currentMonster.getName() + " wants to know what to eat next.");
		System.out.println(currentMonster.getName() + " suggests arms. He has " + currentMonster.getArmCount() + " arms!");
		System.out.println("How many do you want to eat?");
		Scanner input = new Scanner(System.in);
		int consumed = input.nextInt();
		
		if (consumed < 0)
		{
			System.out.println(currentMonster.getName() + " is confused by your negative number and eats your arms instead.");
		}
		else if (consumed == 0)
		{
			System.out.println(currentMonster.getName() + " is sad because you didn't want to eat him. You ungrateful human.");
		}
		else if (consumed > currentMonster.getArmCount())
		{
			System.out.println("That is impossible. He only has " + currentMonster.getArmCount() + " arms. You greedy human.");
		}
		else 
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			System.out.println("He only has " + currentMonster.getArmCount() +  " arms left. You are the real monster.");
		}
		
		//EYES eaten
		System.out.println("Now eat his eyes. " + currentMonster.getName() + " wants to know how many of his " + currentMonster.getEyeCount() + " eyes you will eat?");
		consumed = input.nextInt();
		if (consumed > 0) 
		{
			if (currentMonster.getEyeCount() >= consumed) 
			{
				currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
				System.out.println(currentMonster.getName() + " has " + currentMonster.getEyeCount() + " eyes left. You are the real monster.");
			}
			else 
			{
				System.out.println("That is impossible. He only has " + currentMonster.getEyeCount() +  " eyes. You greedy human.");
			}
		}
		else if(consumed == 0)
		{
			System.out.println(currentMonster.getName() + " is sad because you didn't want to eat him. You ungrateful human.");
		}
		else
		{
			System.out.println(currentMonster.getName() + " is confused by your negative number and eats your eyes instead.");
		}
		
	}
}
