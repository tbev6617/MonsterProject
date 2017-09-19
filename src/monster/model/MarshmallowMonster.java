package monster.model;

public class MarshmallowMonster 
{
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	public MarshmallowMonster()
	{
		//unless we specify values all data members are 0, false, or null!
	}
	public MarshmallowMonster(String name, int eyeCount, int armCount, double tentacleAmount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.tentacleAmount = tentacleAmount;
		this.hasBloop = hasBloop;
	}
	//GETTERS
	public String getName() 
	{
		return name;
	}
	public int getEyeCount() 
	{
		return eyeCount;
	}
	public int getArmCount() 
	{
		return armCount;
	}
	public Double getTentacleAmount()
	{
		return tentacleAmount;
	}
	public boolean hasBloop()
	{
		return hasBloop;
	}
	
	//SETTERS
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	public void setTentacleAmount(Double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	public void setHasBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	
	public String toString()
	{
		String description = "Hi I am a monster named " + name + "! I have " + eyeCount + " eyes and " + armCount + " arms. ";
		description += "I also have "+ tentacleAmount + " tentacles and my bloop existence is " + hasBloop;
		return description;
	}
}
