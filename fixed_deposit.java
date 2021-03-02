import java.util.Scanner;

public class fixed_deposit 
{
	int amount,time_period,start_date;
	float rate_of_interest;
	String nominee;
	Scanner sc = new Scanner(System.in);
	account ac = new account();
	public void make_fd()
	{
		System.out.println("Enter amount :");
		amount = sc.nextInt();
		System.out.println("Enter nominee :");
		nominee = sc.next();
		System.out.println("Enter time period :");
		time_period = sc.nextInt();
		System.out.println("FD made successfully ...");
	}
	public void renew()
	{
		System.out.println("Enter time period :");
		System.out.println("FD renewal successfull ...");
	}
	public void break_fd()
	{
		System.out.println("FD break successfully ...");
	}
}
