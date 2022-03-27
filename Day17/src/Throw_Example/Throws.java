package Throw_Example;
import java.io.IOException;

public class Throws {
	
	void m1(int num)throws IOException, ClassNotFoundException
	{
		if (num==1)
		throw new IOException ("IOException has occured");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	}
	public static void main(String[] args) 
	{
		try {
			Throws et=new Throws();
			et.m1(1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	
	
}
