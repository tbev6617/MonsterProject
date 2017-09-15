package monster.controller;

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
	}
}
