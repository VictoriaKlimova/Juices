import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ReadJuices {
	public static ArrayList<Juice> readFile(String filename)
	{
		ArrayList<Juice> arr = new ArrayList<Juice>();
		try
		{
			FileReader fr1 = new FileReader("juice.txt");
			Scanner sc = new Scanner(fr1);
			while(sc.hasNextLine()) {
				Juice buff = new Juice();
				String str = sc.nextLine();
				StringTokenizer des = new StringTokenizer(str,".,:;?! ");
				int i=0;
				while(des.hasMoreTokens())
				{
					buff.addComponent(des.nextToken());
				}
				arr.add(buff);
			}
		}
		catch(IOException exc)
		{
			System.err.println("IOException");
		}
		catch(Exception exc)
		{
			System.err.println("Error");
		}
		return arr;
	}
}
