import java.util.Scanner;

public class account
{
	String account_type;
	int account_no,balance;
	Scanner sc = new Scanner(System.in);
	customer cust = new customer();
	
	public void create()
	{
		System.out.println("Enter your name :");
		cust.cust_name = sc.nextLine();
		System.out.println("Enter your address :");
		cust.address = sc.nextLine();
		System.out.println("Enter your mobile_no :");
		cust.mobile_no = sc.nextInt();
		System.out.println("Enter your e-mail ID :");
		cust.e_mail = sc.nextLine();
		System.out.println("Account is created successfully");
	}
	public void search()
	{
		System.out.println("Account number is successfully searched ...:");
	}
	public void update()
	{
		int ch1 = 0;
		do
		{
			System.out.println("1. Update address");
			System.out.println("2. Update mobile number");
			System.out.println("3. Update e-mail ID");
			System.out.println("Enter your choice");
			switch(ch1)
			{
			case 1:
				System.out.println("Enter address :");
				cust.address = sc.nextLine();
				System.out.println("Address saved successfully ...");
				break;
			case 2:
				System.out.println("Enter mobile number :");
				cust.mobile_no = sc.nextInt();
				System.out.println("Mobile number saved successfully ...");
				break;
			case 3:
				System.out.println("Enter e-mail ID :");
				cust.e_mail = sc.nextLine();
				System.out.println("E-mail ID saved successfully ...");
				break;
			default:
				break;
			}
		}while(ch1 != 5);
	}
	public void delete()
	{
		System.out.println("Enter the account number :");
		System.out.println("Account number deleted successfully ...");
	}
	public void transfer_money()
	{
		System.out.println("Enter account number of reciever :");
		System.out.println("Enter amount :");
		System.out.println("Amount transfered successfully ...");
	}
	
}