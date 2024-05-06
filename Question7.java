/*
Create a class of student and perform following operations
1. Get user data - roll no, name, marks
2. Calculate - total, grades
3. Print data
4. Create class object single and multiple
*/

class Student
{
	int rn,marks;
	String name;
	int total;
	char grade;
	
	Student(int rollno, String n,int marks)
	{
		this.rn = rollno;
		this.name = n;
		this.marks = marks;
	}
	
	public static void main(String args[])
	{
		Student s1 = new Student(101,"JACK",80);
		s1.displayData();
		s1.calculate();
		
		Student s2 = new Student(302,"Vaibhavi",95);
		s2.displayData();
		s2.calculate();
		
		Student s3 = new Student(604,"Rohan",63);
		s3.displayData();
		s3.calculate();
	}
	
	public void displayData()
	{
		System.out.println("Roll Number = "+rn);
		System.out.println("Student Name = "+name);
		System.out.println("Marks = "+marks);
	}
	
	public void calculate()
	{
		total = marks;
		
		if(total >= 90)
			grade = 'A';
		else if(total >= 80)
			grade = 'B';
		else if(total >= 70)
			grade = 'C';
		else if(total >= 60)
			grade = 'D';
			
		System.out.println("Total = "+total);
		System.out.println("Grade = "+grade+"\n");
	}
	
}
