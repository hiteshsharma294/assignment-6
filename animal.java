class Animal
{
	String breed,colour;
	void speak(){
	}
}
class cat extends Animal
{
	void speak()
	{
		breed="Persian";
		colour="Brown";
		System.out.println("Breed:"+breed);
		System.out.println("Colour:"+colour);
	}
}
class dog extends Animal
{
	void speak()
	{
		breed="Alsatian";
		colour="Black";
		System.out.println("Breed:"+breed);
		System.out.println("Colour:"+colour);
	}
	public static void main(String args[])
	{
		dog d=new dog();
		cat c=new cat();
		d.speak();
		c.speak();
	}
}