package com.exerecise27mvchelloworld.model;

public class UserModel 
{
	private short age = 0;
	private String name = "";
	private int id = 0;
	
	public UserModel()
	{
	}
	public UserModel(int id)
	{
		this.id=id;
		this.name="";
		this.age=0;
	}
	public UserModel(int id, String name, short age)
	{
		this.id=id;
		this.name="";
		this.age=0;
	}
	
	public short getAge()
	{
		return age;		
	}
	public void setAge(short i)
	{
		this.age=i;
	}
	public String getName()
	{
		return name;		
	}
	public void setName(String nombre)
	{
		this.name=nombre;
	}
	public int getId()
	{
		return id;		
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
}
