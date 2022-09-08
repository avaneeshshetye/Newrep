package recursion;

public class String_reverse {

	public static void reverse(String str,int i) {
		
		if(i==0) {
		System.out.print(str.charAt(i));
		return;
		}
		else {
			System.out.print(str.charAt(i));
			reverse(str,i-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "abcde";
		reverse(str,str.length()-1);
	

}
}

