import java.util.ArrayList;


public class Test {
		
	public static void main(String[] args) {
		ArrayList<Juice> arr = ReadJuices.readFile("juice.txt");
		WriteJuices.WriteComponents(arr);
		WriteJuices.WriteSetOfComponents(arr);
		WriteJuices.WriteNumberOfWashes(arr);	
	}
}