package interviewPrep;

public class myTestInterview {

	public static void main(String[] args) 
	{
		int [][] matrix = {
				{2, 4, 5},
				{1, 2, 3},
				{4, 8, 7}
		};
		int columnNum=0;
		
		
		myTestInterview m1 = new myTestInterview();
		
		m1.largestNumber(matrix);
		m1.smallestNumber(matrix, columnNum);
		
	}
	
	 public void largestNumber(int [][] matrix)
	 { 
		 int largest= matrix[0][0];
		 for(int i =0; i<matrix.length; i++)
		 {
			 for(int j =0; j<matrix.length; j++)
			 {
				if(matrix[i][j]>largest)
				{
					largest=matrix[i][j];
				}
			}
		 }
		 System.out.println("Largest number is :: "+largest);
	 }
	 
	 public void smallestNumber(int [][] matrix, int column)
	 {
		 int smallest= matrix[0][column];
		 for(int i =0; i<matrix.length; i++)
		 {
			 if(smallest > matrix[i][column])
			 {
				 smallest= matrix[i][column];
			 }
		 }
		 System.out.println("Smallest number is :: "+smallest);
	 }
	

}
