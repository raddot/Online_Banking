import java.util.Scanner;

public class customer
{
	String cust_name,address,password;
	String e_mail;
	int mobile_no;
	Scanner sc = new Scanner(System.in);
	public void log_in()
	{
		System.out.println("Enter e-mail ID :");
		e_mail = sc.nextLine();
		System.out.println("Enter password :");
		password = sc.nextLine();
		System.out.println("Successfully log in ...");
	}
	public void log_out()
	{
		System.out.println("Successfully log out ...");
	}
	public void action_perf()
	{
			int ch1 = 0;
			do
			{
				System.out.println("1. Update address \n 2. Update mobile no. \n 3. Update e-mail ID");
				ch1 = sc.nextInt();
				switch(ch1)
				{
				case 1:
					System.out.println("Enter address :");
					address = sc.next();
					System.out.println("Address updated successfully ...");
					break;
				case 2:
					System.out.println("Enter mobile number :");
					mobile_no = sc.nextInt();
					System.out.println("Mobile number updated successfully ...");
					break;
				case 3:
					System.out.println("Enter e-mail id :");
					e_mail = sc.next();
					System.out.println("E-mail ID updated successfully ...");
				}
			}while(ch1 != 4);
		}
}