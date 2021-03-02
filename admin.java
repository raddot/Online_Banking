import java.util.Scanner;

public class admin 
{
	String user_name,password;
	int branch_code;
	Scanner sc = new Scanner(System.in);
	public void log_in()
	{
		System.out.println("Enter username :");
		user_name = sc.nextLine();
		System.out.println("Enter password :");
		password = sc.nextLine();
	}
	public void log_out()
	{
		System.out.println("Log out successfull ...");
	}
}
