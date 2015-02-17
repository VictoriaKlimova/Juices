import java.io.*;
import java.util.*;


public class WriteJuices {
	public static void WriteSetOfComponents(ArrayList<Juice> arr)
	{
		File f1 = new File("juice1.out");
		try {
			f1.createNewFile();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			PrintWriter out = new PrintWriter(f1.getPath());
			out.print(Juicer.setOfComponents(arr));
			out.checkError();
			out.println();	
		}
		catch (IOException exc) {
			exc.printStackTrace();
		}
	}
	public static void WriteComponents(ArrayList<Juice> arr)
	{
		File f2 = new File("juice2.out");
		try {
			f2.createNewFile();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			PrintWriter out = new PrintWriter(f2.getPath());
			out.print(Juicer.sortedListOfComponents(arr));
			out.checkError();
			out.println();	
		}
		catch (IOException exc) {
			exc.printStackTrace();
		}
	}
	public static void WriteNumberOfWashes(ArrayList<Juice> arr)
	{
		File f3 = new File("juice3.out");
		try {
			f3.createNewFile();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			PrintWriter out = new PrintWriter(f3.getPath());
			Integer num = Juicer.numberOfWashes(arr);
			out.print(num.toString());
			out.checkError();
			out.println();	
		}
		catch (IOException exc) {
			exc.printStackTrace();
		}
	}
}