import java.util.*;


class ConversionExample {
	public static void main(String args[]) {
		Integer iref = 2; // ok
		Integer iref2 = (Integer) 2; // ok
		Integer iref3 = (Integer) (int) 3.14;
		Integer iref4 = (int) 3.14; // ok
	//	Integer iref5 = 3.14; // not ok
	    Integer iref6 = null;
		int iVal = iref6;
	}
}

/* 
 * General Rule
 * ------------
 * Boxing or unboxing followed by optional widening conversion is possible
 * however widening/narrowing coversion followed by box/unbox is not possible
 */ 

class MyClass {
	private Map<String, Integer> accounts = new HashMap<String, Integer>();
	public int getBalance(String accountName) {
		Integer total = accounts.get(accountName);
		if(total == null) 
			return 0;
		else 
			return total.intValue();
	}
	public void setBalance(String accountName, int amount) {
		accounts.put(accountName, new Integer(amount));
	}
}

class MyClassVer2 {
	private Map<String, Integer> accounts = new HashMap<String, Integer>();
	public int getBalance(String accountName) {
		Integer total = accounts.get(accountName);
		if(total == null) 
			return 0;
		else 
			return total;
	}
	public void setBalance(String accountName, int amount) {
		accounts.put(accountName, new Integer(amount));
	}
}