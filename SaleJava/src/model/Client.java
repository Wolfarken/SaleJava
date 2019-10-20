package model;

public class Client 
{
	private String document;
	private String name;
	private String birthday;
	private int loyaltyScore;
	
	
	public String getDocument() 
	{
		return document;
	}
	public void setDocument(String document) 
	{
		this.document = document;
	}
	
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public String getBirthday() 
	{
		return birthday;
	}
	public void setBirthday(String birthday) 
	{
		this.birthday = birthday;
	}
	
	
	public int getLoyaltyScore() 
	{
		return loyaltyScore;
	}
	public void setLoyaltyScore(int loyaltyScore) 
	{
		this.loyaltyScore = loyaltyScore;
	}
}
