import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputStr {
	public static void main(String args[]) throws  IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Enter number");
		long num = Integer.parseInt(br.readLine());
		System.out.println("Enter entered " +num);
	}

}

