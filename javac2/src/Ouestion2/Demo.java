package Ouestion2;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Studnet objects need to be Created");
		
		int num = sc.nextInt();
		Student[] student = new Student[num];
		for(int i=0; i<student.length; i++)
		{
			System.out.println("Inter the Studnet Details");
			student[i]= new Student();
			
			System.out.print("Roll");
			int roll = sc.nextInt();
			student[i].setRoll(roll);
			
			System.out.print("name");
			String name = sc.next();
			student[i].setName(name);
			
			
			System.out.print("Addresd");
			String address = sc.next();
			student[i].setAddress(address);
			
			
			System.out.print("marks: ");
			int marks = sc.nextInt();
			student[i].setMarks(marks);
			
			
			System.out.println("////////////");
			
			
			
			
		}
		
		int sum = 0;
		int average;
		for(int j=0; j<student.length; j++)
		{
			System.out.println("Studnet"+(j+1));
			System.out.println("Roll Number:"+student[j].getRoll());
			System.out.println("Name:"+student[j].getName());
			System.out.println("Addres:"+student[j].getAddress());
			System.out.println("Marks:"+student[j].getMarks());
			System.out.println(".............");
			sum = sum + student[j].getMarks();
			
		}
		average = (sum)/(student.length);
		System.out.println("Averrage of all Studnet marks:"+ average);
	}

}
