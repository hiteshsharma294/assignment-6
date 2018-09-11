class overload
{
	public void print()
	{
		System.out.println("Null Arguments");
	}
	public void print(int n,double x)
	{
		System.out.println(n);
		System.out.println(x);
	}
	public static void main(String args[])
	{
		overload o=new overload();
		o.print();
		o.print(10,1.2);
	}
}
		