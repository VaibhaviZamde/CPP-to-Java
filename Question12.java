//Array index out of bound

class Sample
{
	public static void main(String args[])
	{
		int arr[] = {10 , 20 , 30,40,50};
		
		try
		{
			System.out.print("Array is ");
			for(int i=0; i<6; i++)
			{
				System.out.print(" "+arr[6]);
			} 
			System.out.println();
		}
		catch(Exception ex)
		{
			System.out.println("Array index out of bound");
		}
	}
}
