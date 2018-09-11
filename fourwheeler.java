abstract class vehicle
{
	void start(){
	}
	void stop(){
	}
}
class twowheeler extends vehicle
{
	void start()
	{
		System.out.println("Twowheeler Started");
	}
	void stop()
	{
		System.out.println("Twowheeler stopped");
	}
}
class fourwheeler extends vehicle
{
	void start()
	{
		System.out.println("Fourwheeler Started");
	}
	void stop()
	{
		System.out.println("Fourwheeler stopped");
	}
	public static void main(String args[])
	{
		twowheeler t=new twowheeler();
		fourwheeler f=new fourwheeler();
		t.start();
		t.stop();
		f.start();
		f.stop();
	}
}