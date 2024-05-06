//WAP to implement exception handling mechanism for divide by zero and array index out of bounds exception

class Sample
{
	public static void main(String args[])
	{
		int a= 10  , b = 0;
		float c;
		
		try
		{
			c = a/b;
			System.out.println("c = "+c);
		}
		catch(Exception ex)
		{
			System.out.println("Divide by zero exception");
		}
	}
}
