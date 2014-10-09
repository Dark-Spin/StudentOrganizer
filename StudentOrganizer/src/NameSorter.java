import java.util.Comparator;

public class NameSorter implements Comparator<Students>
	{

	public int compare(Students s1, Students s2)
		{
		return s2.getLastName().compareTo(s1.getLastName());
		}
	}
	
