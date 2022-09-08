package recursion;

public class permutation {

	public static void permutation(String str, String perm) {
		
		if(str.length()==0) {
			System.out.println(perm);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char element=str.charAt(i);
			String newStr = str.substring(0,i) + str.substring(i+1);
			permutation(newStr,perm+element);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc";
		permutation(str,"");

}
}
