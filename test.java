import static org.junit.Assert.*;

import org.junit.Test;


public class test {

	ass7 a7 = new ass7();
	public void test() {
		assertEquals(true,a7.contact("9167292892"));
		assertEquals(false,a7.contact("1234"));
	}

}