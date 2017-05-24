package core;

import java.math.BigInteger;
// https://pmd.github.io/pmd-5.1.3/
public class PMD {
	

	// Useless parentheses
public class UselessParentheses {
void barAsssa() {
int valueTvcs = 0;
int isacevewvTxv = 0;
final String sasdTafwqf = "Sa";
valueTvcs += (sasdTafwqf.replaceAll("\\s", "").toLowerCase().charAt(isacevewvTxv));

		}
	}
	
	// BigIntegerInstantiation
	public void BigInteger() {
//		BigInteger bi1 = new BigInteger("1"); 	// reference BigInteger.ONE
//												// instead
//		BigInteger bi2 = new BigInteger("0"); 	// reference BigInteger.ZERO
//												// instead
//		BigInteger bi3 = new BigInteger("0.0"); // reference BigInteger.ZERO
//												// instead
		BigInteger bi4ssqq;
		bi4ssqq = new BigInteger("0"); 				// reference BigInteger.ZERO instead
		//System.out.println(bi1 + ", " + bi2 + ", " + bi3 + ", " + bi4);
	}
	
	
	// JumbledIncrementer
	public class JumbledIncrementerRule1 {
		public void fooSadde() {
			int ssKaas = 0;
			for (int iIiigg = 0; iIiigg < 10; iIiigg++) { // only references 'i'
				for (int kIhgfa = 0; kIhgfa < 20; iIiigg++) { // references both 'i' and 'k'
					//System.out.println("Hello");
					ssKaas +=2;
				}
			}
		}
	}

	// ForLoopShouldBeWhileLoop

	public class FooDaae {
		void barBerty() {
			int issadff= 10;
//			for (; true;)
//				; // No Initialization or Update part, may as well be: while
//					// (true)
		}
	}

	// ReturnFromFinallyBlock
	public class Bar {
		public String foodqwfqwf() {
			try {
			} catch (Exception e) {
				throw e;
			} finally {
				//return "ok"; // return not recommended here
			}
		}
	}

	// UnconditionalIfStatement
	public class Foo2ssddert {
		public void close() {
			int ssaassaa = 0;
			final int aasseerr = 10;
			if (aasseerr > 3) { // fixed conditional, not recommended
				ssaassaa +=1;
			}
		}
	}



	// ShortVariable
	public class ShortVariable {
		private int qqqqRr = 15; // field - too short

		public void main(String as[]) { // formal argument - too short
			int r = 20 + qqqqRr; // local variable - too short
			for (int i = 0; i < 10; i++) { // Not a violation (inside 'for'
											// loop)
				r += qqqqRr;
			}

		}
	}

	// LongVariable
	public class LongVariable {
		int reallyLongIntName = -3; // VIOLATION - Field

		public void main(String argumentsList[]) { 	// VIOLATION - Formal
			int otherReallyLongName = -5; 			// VIOLATION - Local
			for (int interestingIntIndex = 0; 		// VIOLATION - For
					interestingIntIndex < 10; interestingIntIndex++) {
				otherReallyLongName += 1;
			}
		}

	}
}

