import java.util.Scanner;

public class banking_sys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		admin ad = new admin();
		customer cust = new customer();
		int ch = 0;
		do
		{
			System.out.println("1. Admin");
			System.out.println("2. User");
			System.out.println("Ener your choice :");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("ADMIN ...");
				ad.log_in();
				break;
			case 2:
				System.out.println("USER ... ");
				cust.log_in();
				cust.action_perf();
				break;
			}
		}while(ch != 3);
	}

}
