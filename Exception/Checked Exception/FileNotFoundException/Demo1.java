import java.io.*;
public class Demo1 {
	public static void main(String[] args)
		throws FileNotFoundException
	{
		// Assigning null value to object of FileInputStream
		FileInputStream GFG = null;

		try {

			// Giving path where file should exists to read content
			GFG = new FileInputStream(
				"/home/mayur/GFG.txt");
		}

		catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		}
	}
}


