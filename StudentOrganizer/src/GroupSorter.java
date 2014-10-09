import java.util.Comparator;

public class GroupSorter implements Comparator<Students>
	{

	public int compare (Students s1, Students s2)
	{
		if(s1.getGroup() > s2.getGroup())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	}
