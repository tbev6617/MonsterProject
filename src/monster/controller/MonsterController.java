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
		System.out.println(Albert);
		interactWithMonster(Albert);
	}
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		System.out.println(currentMonster.getName() + " suggests arms. He has " + currentMonster.getArmCount() + " arms!");
		System.out.println("How many do you want to eat?");
		Scanner input = new Scanner(System.in);
		int consumed = input.nextInt();
		currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
		if (currentMonster.getArmCount() < 0) {
			currentMonster.setArmCount(0);
		}
		System.out.println(currentMonster.getName() + " has " + currentMonster.getArmCount() + " arms now. You are the real monster!");
	}
}
