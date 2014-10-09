public class Students

		{
		private String firstName;
		private String lastName;
		private double score;
		private int group;
		
		
		public Students (String fn, String ln, double sc, int gro)
			{
			firstName = fn;
			lastName = ln;
			score = sc;
			group = gro;		
			}
		


		public String getFirstName()
			{
			return firstName;
			}


		public void setFirstName(String firstName)
			{
			this.firstName = firstName;
			}


		public String getLastName()
			{
			return lastName;
			}


		public void setLastName(String lastName)
			{
			this.lastName = lastName;
			}


		public double getScore()
			{
			return score;
			}


		public void setGrade(double Score)
			{
			this.score = score;
			}


		@Override
		public String toString()
			{
			return  firstName + " "
					+ lastName + "";
			}



		public int getGroup()
			{
			return group;
			}


		public void setGroup(int group)
			{
			this.group = group;
			}
		
		
}