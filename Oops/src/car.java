public class car {
	
	int noofcars; 
	String Model;
	int speed;
	
	public int getSpeed ()
	{
		return speed;
	}
	public void setSpeed(int S)
	{
		this.speed=S;
	}
	
	void display ()
	{
		System.out.println("Welcome to Tata Motors");
	}
	public static void main (String [] args)
	{
	car obj=new car ();
	
	obj.display();
	obj.setSpeed(80);
	System.out.println(obj.getSpeed() );
	}
}