import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
	{
	
 static ArrayList <Students> studentRoster = new ArrayList<Students>();
 
 static int numberOfGroups;
 
 
	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner (new File("classroster.txt"));
		int numberOfLinesOfData = file.nextInt();
		file.nextLine();
		
		for (int i = 0; i < numberOfLinesOfData; i ++)
			{
			String firstName= file.next();
			String lastName = file.next();
			double score = file.nextDouble();
			studentRoster.add(new Students (firstName, lastName, score, 0));
			}
		
		Collections.sort(studentRoster, new ScoreSorter());
		
		System.out.println("How many groups do you want?");
		Scanner userInput = new Scanner (System.in);
		numberOfGroups = userInput.nextInt();
		
		
		int counter = 1;
		for(int i = 0; i < studentRoster.size(); i++)
			{
			studentRoster.get(i).setGroup(counter);
			if(counter <numberOfGroups)
				{
				counter ++;
				}
			else
				{
				counter =1;
				}
			}
		Collections.sort(studentRoster, new NameSorter());
		Collections.sort(studentRoster, new GroupSorter());
		
		for (int i =1; i <= numberOfGroups; i++)
			{
			System.out.println("\n Group: " + i + "\n");
			
			for(int x = 0; x < studentRoster.size(); x++)
				{
				
				if(studentRoster.get(x).getGroup() == (i) )
					{
					System.out.println(studentRoster.get(x));
					}
				
			}
			
			}
		
		
		}

	}
