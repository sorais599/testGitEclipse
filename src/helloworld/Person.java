package helloworld;
public class Person
{
	private String name,address;
	public Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public String getAdrress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	@Override
	public String toString()
	{
		return String.format("Person[name=%s,address=%s]",name,address);
	}
}

