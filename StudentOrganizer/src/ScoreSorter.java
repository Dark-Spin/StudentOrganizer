import java.util.Comparator;

public class ScoreSorter implements Comparator<Students>
	{

	public int compare (Students s1, Students s2)
	{
		if(s1.getScore() < s2.getScore())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	}
