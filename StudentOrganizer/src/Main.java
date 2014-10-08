import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main
	{
	static  int numberOfGroups; 
	static int counter =0; 
	
	 public static void main(String[] args) throws IOException
		{
		Student.readDataFile(); 
		System.out.println("How many groups do you want?");
		Scanner userInput = new Scanner(System.in); 
		numberOfGroups = userInput.nextInt()+1; 
		organizeGroupZero(); 
		Collections.sort(Student.gradebook, new GroupSorter());
		System.out.println(Student.gradebook);
		}
//	ask the user how many groups wanted 
//	create groups ArrayList
	 
	 public static void groupSorter()
			{
			counter =0; 
			do
				{
				for(int i=1; i<numberOfGroups; i++)
					{
				Student.gradebook.get(counter).setGroup(i);
				counter++;
					}
				}
			while(counter<Student.gradebook.size()); 
			}
	 
			
	 
public static  void organizeGroupZero()
		{
		
		Collections.sort(Student.gradebook, new ScoreSorter());
		Collections.sort(Student.gradebook, new NameSorter());
		groupSorter(); 
		}




 