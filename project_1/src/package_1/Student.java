package package_1;

public class Student 
{

		int rollNo;
		int age;
			
		public void Display1()
		{
			System.out.println("welcome to all of you");
		}
		
		public void Display2()
		{
			System.out.println("automation is very easy");
		}
		
		public static void main(String[] args) 
		{
			Student mystudent = new Student();
			
			mystudent.rollNo=1;
			System.out.println(mystudent.rollNo);
			
			mystudent.age=55;
			System.out.println(mystudent.age);
			
			mystudent.Display1();
			mystudent.Display2();
		}
}
			
				
			
		