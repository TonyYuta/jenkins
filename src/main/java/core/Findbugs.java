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

}
