package recursion;

public class Firstindex_lastindex {
	public static int first = -1;
	public static int last = -1;
	
	public static void firstLast(String str, int i,char A) {
		
	
		
		if(i==str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currentChar = str.charAt(i);
		if (currentChar== A){
		if(first == -1) {
			first = i;
		}
		else {
			last = i;
		}
	}
		firstLast(str,i+1,A);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		firstLast("abcddde",0,"a");
	}

}
