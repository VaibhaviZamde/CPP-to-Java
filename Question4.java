//Write a program for string operations in java using string and cstring type

class Question4
{
	public static void  main(String args[])
	{
		String str = "Hello Everyone";
		String str1 = str.replace("l","m");
		
		System.out.println("str = "+str);
		System.out.println("str1 = "+str1);
		
		String str2 = new String("Hello Everyone");
		String str3 = str2.concat(" SGGS");
		
		System.out.println("str2 = "+str2);
		System.out.println("str3 = "+str3);
	}
}
