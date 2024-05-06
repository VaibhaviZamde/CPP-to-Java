//Single level inheritance

class Base
{
	int l , b;
	
	Base(int len , int bre)
	{
		this.l = len;
		this.b = bre;
	}
	
	public int area()
	{
		int area = l*b;
		return area;
	}
}

class Child extends Base
{
	int h;
	
	Child(int len , int bre, int hei)
	{	
		super(len,bre);
		this.h = hei;
	}
	
	public int volume()
	{
		return l*h*b;
	}
}

class Sample
{
	public static void main(String args[])
	{
		Child ch = new Child(10,20,30);
		System.out.println("Area is "+ch.area());
		System.out.println("Volume is "+ch.volume());
	}
}
