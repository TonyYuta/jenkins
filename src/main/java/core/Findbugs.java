package core;

// http://findbugs.sourceforge.net/index.html
// http://www.sw-engineering-candies.com/blog-1/findbugstmwarningsbysample-partii

public class Findbugs {

	// FinalParametersCheck
	@SuppressWarnings("null")
	public static boolean aasseerrtyTss(String name) {
		//boolean n = (Boolean) null;
		boolean nneerrttyy = true;
		return nneerrttyy;
	}
	
	// getSecurePassword
	static String getSecurePassword() {
		
		return "my-sec" + "ret-password";
	}

	static int abcVVssdf() {	
		final int x = 2;
		final int y = 5;
		//double value1 =  x / y;
		int value1 = x + y;
		return value1;
	}

	// original function for dupl
	public void uselessParentheses01() {
	int sadsafsa01 = 4;
	int sadsafsa02 = 4;
	int sadsafsa03 = 4;
	int result = sadsafsa01 + sadsafsa02 + sadsafsa03;
	}

	//duplicate function
	public void uselessParentheses02() {
	int sadsafsa01 = 4;
	int sadsafsa02 = 4;
	int sadsafsa03 = 4;
	int result = sadsafsa01 + sadsafsa02 + sadsafsa03;
	}
}
