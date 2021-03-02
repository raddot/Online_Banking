import java.util.Scanner;

public class transfer_type {
static transfer ab = new transfer();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do
		{
			System.out.println("1. Neft Transfer");
			System.out.println("2. Imps Transfer");
			System.out.println("3. Upi Transfer");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				neft type = new neft();
				ab.submit(type);
				break;
			case 2:
				imps type1 = new imps();
				ab.submit(type1);
				break;
			case 3:
				upi type11 = new upi();
				ab.submit(type11);
				break;
			}
		}while(ch != 4);

	}

}
