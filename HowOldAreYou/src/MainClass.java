import java.util.Scanner;

public class MainClass 
{
	static Scanner input = new Scanner(System.in);
	static boolean isProgramRunning = false;
	
	public static void main(String[] args)
	{
		String userName;
		
		int userChoice;
		int age;
		int salary;
		
		System.out.println("Hello, whats your name?");
		
		userName = input.nextLine();
				
		System.out.println("Hello "+ userName + "How Old are you?");
		
		age = input.nextInt();
		
		System.out.println("So your " + age + " Thats not old at all.");
		
		System.out.println("How much do you make " + userName);
		
		salary = input.nextInt();
		
		System.out.println(salary + "! I hope thats per hour and not per year");
	}
}