
public class Student {
	
	int Marks;
	String Subjects;
	int Mark;
	public void setMark(int M)
	{
	this.Mark=M;
	}
	public int getMark()
	{
	return Mark;
	}
	void display()
	{
	System.out.println("Java Programming Marks Obtained:\n");
	
	}
	public static void main(String[] args)
	{
	//object creation  we create object from here
	//syntax for object -- classname objectname=new classname();

	Student obj=new Student();
	obj.display();
	obj.setMark(80);
	obj.setMark(70);
	obj.setMark(90);
	System.out.println(obj.getMark());
	}
}

