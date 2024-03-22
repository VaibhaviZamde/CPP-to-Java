//[print sum of array of 10 digits
class Question2
{
	public static void main(String args[])
	{
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		System.out.print("Array is");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
		
		int sum = 0;
		for(int i =0; i<arr.length ; i++)
		{
			sum = sum + arr[i];	
		}
		
		System.out.println("\nSum is "+sum);
	}
}
