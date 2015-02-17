import java.util.*;


public class Juicer {

	public static LinkedHashSet<String> setOfComponents(ArrayList<Juice> array)
	{
		LinkedHashSet<String> fruits = new LinkedHashSet<String>();
		for(Juice i: array) {
			fruits.addAll(i.getComponents());
		}
		return fruits;

	}

	public static ArrayList<String> listOfComponents(ArrayList<Juice> array) {
		ArrayList<String> fruits = new ArrayList<String>();
		for(Juice i: array) {
			fruits.addAll(i.getComponents());
		}
		return fruits;
	}

	public static ArrayList<String> sortedListOfComponents(ArrayList<Juice> array) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits = listOfComponents(array);
		Collections.sort(fruits);
		return fruits;
	}

	public static int numberOfWashes(ArrayList<Juice> array) {
		int number = 0;
		TreeMap<Juice,Integer> juices = new TreeMap<Juice,Integer>();
		for(Juice i: array) {
			juices.put(i, i.getComponents().size());
		}

		while(!juices.isEmpty())
		{
			int min = Integer.MAX_VALUE;
			Juice minComponents = new Juice();
			for (Map.Entry entry: juices.entrySet()) { 
				Integer value = (Integer) entry.getValue();
				if(value < min)
				{
					min = value;
					minComponents = (Juice) entry.getKey();
				} 
			}
			juices.remove(minComponents);
			// теперь надо искать минимальный с такими же компонентами
			cycle: for (Map.Entry entry: juices.entrySet()) { 
				Integer value = (Integer) entry.getValue();
				if(value > min)
				{
					Juice key = (Juice) entry.getKey();
					if(minComponents.identicalComponents(key) && key.label == false)
					{
						key.label = true;
						number -= 1;
						break cycle;
					}
				} 
			}
			number++;
		}
		return number;

	}
}
