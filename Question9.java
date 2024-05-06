/*
WAP for class Triangle, Calculate area function, and pass the data using constructor, 
1. Default Constructor
2. Parameter Constructor
3. Copy Constructor
*/

class Triangle
{
	int base,height;
	
	Triangle()
	{
		base = 5;
		height = 10;
	}
	
	Triangle(int b , int h)
	{
		base = b;
		height = h;
	}
	
	Triangle(Triangle tr)
	{
		base = tr.base;
		height = tr.height;	
	}
	
	public static void main(String args[])
	{
		Triangle tr1 = new Triangle();
		System.out.println("Area of triangle is "+tr1.area());
		
		Triangle tr2 = new Triangle(2,5);
		System.out.println("Area of triangle is "+tr2.area());
		
		Triangle tr3 = new Triangle(tr2);
		System.out.println("Area of triangle is "+tr3.area());
	}
	
	public float area()
	{
		float area = (float) (base*height)/2;
		return area;
	}
}
