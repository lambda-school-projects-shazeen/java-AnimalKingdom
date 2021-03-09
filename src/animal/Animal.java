package animal;

abstract class Animal
{
	protected static int maxId = 0;
	protected int id;
	protected String name;
	protected int year;


	public Animal(String name, int year)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.year = year;
	}

	public String move(String move)
	{
		return move;
	}

	public String breath(String breath)
	{
		return breath;
	}

	public String reproduce(String reproduce)
	{
		return reproduce;
	}

	abstract String getName();
	abstract String getYear();
	
}