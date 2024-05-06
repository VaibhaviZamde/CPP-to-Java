//MAtrix Addition 3X3
class Question3
{
	public static void main(String args[])
	{
		int a[][] = {{1,2,3},{4,5,6},{7,3,1}};
		int b[][] = {{1,2,3},{4,5,6},{7,3,1}};
		int c[][] = new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Addition of 3x3 matrix :");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
		
	}
}
