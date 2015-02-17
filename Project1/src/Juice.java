import java.util.ArrayList;


public class Juice implements Comparable<Juice> {
	private ArrayList<String> components = null;
	public boolean label = false;
	
	public Juice() {
		components = new ArrayList<String>();
	}
	
	public Juice(ArrayList<String> comp)
	{
		setComponents(comp);
	}
	public Juice(String[] comp)
	{
		components = new ArrayList<String>();
		for(String i:comp) {
			components.add(i);
		}
	}
	
	public ArrayList<String> getComponents() {
		return components;
	}
	
	public void setComponents(ArrayList<String> comp)
	{
		components = new ArrayList<String>();
		components = comp;
	}
	public void addComponent(String str)
	{
		components.add(str);
	}
	public String toString(){
		StringBuffer str = new StringBuffer();
		for(String i:components) {
			str.append(" " +i);
		}
		return str.toString();
	}
	
	public boolean identicalComponents(Juice obj)
	{
		int num=0;
		for(String i: components) {
			for(String j: obj.components) {
				if(i.compareTo(j) == 0) {
					num += 1;
					break;
				}
			}
		}
		if(num == components.size())
			return true;
		return false;
	}
	
	public int compareTo(Juice obj)
	{
		int num=0;
		if(components.size() - obj.components.size() != 0)
			return components.size() - obj.components.size();
		for(String i: components) {
			for(String j: obj.components) {
				if(i.compareTo(j) == 0) {
					num=0;
					break;
				}
				else {
					num = i.compareTo(j);
				}
			}
			if(num != 0)
				return num;
		}
		return num;
	}
	
}