import java.util.Scanner;
class GradeAverage 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		float avg=0f;	//0 int to float conversion 
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter the grade of student "+i+": ");
			float m = sc.nextFloat();
			while(m<0 || m>100)
			{
				System.out.print("Ivalis grade, try again...\nEnter the grade of student "+i+": ");
				m = sc.nextFloat();
			}
			avg = avg + m;
		}
		System.out.println("The average is: "+avg/n);
	}

}