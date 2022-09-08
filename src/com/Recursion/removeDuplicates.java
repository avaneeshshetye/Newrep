package recursion;

public class removeDuplicates {
	public static boolean [] map = new boolean[26];

	public static void removeDuplicates(int i,String str, String newString)
	{

		
		
		if(i==str.length()) {
			System.out.println(newString);
			return;
		}
		char element = str.charAt(i);
		if(map[element-'a']) {
			
			removeDuplicates(i+1,str,newString);
		}
		else {
			newString+=element;
			map[element-'a'] = true;
			removeDuplicates(i+1,str,newString);
			
			}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbcfffdddopook";
		removeDuplicates(0,str,"");
	}

}
