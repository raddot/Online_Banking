import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ass7 {
	public boolean contact(String contact)
	{
		boolean res;
		Pattern pat = Pattern.compile("[0-9]");
		Matcher mat = pat.matcher(contact);		
		res = false;
		if(contact.length() == 10 && mat.find())
		{
			System.out.println("Valid Contact");
			res = true;
		}
		else
		{
			System.out.println("Invalid Contact");
			res = false;
		}
		return res;
	}
	
}
