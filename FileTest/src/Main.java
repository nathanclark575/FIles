import java.io.FileNotFoundException;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Hello World");
		
		Test test = new Test();
		
		//test.addToFile("nathan", "1234");
		//test.addToFile("Grace", "abc");
		
		//test.readFile();
		
		test.check("nathan", "1234");
		
	}
}