//WAP to  find the sum of all elements in an array using recursion
class Question5
{
	public static void main(String args[])
	{
	
		int a[] = {1, 2,3,4,5,6,7,8,9};
		int size = a.length;
		
		System.out.print("Array is :");
		for(int i=0; i<size; i++)
		{
			System.out.print(" "+a[i]);
		}
		
		int sum = arraySum(a,size);
		System.out.println("\nSum of array is "+sum);
	}
	
	public static int arraySum(int arr[],int s)
	{
		if(s<=0)
		{
			return 0;
		}
		else
		{
			return (arraySum(arr,s-1) +arr[s-1]);
		}
	}
}
