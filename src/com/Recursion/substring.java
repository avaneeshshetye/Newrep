package recursion;

import java.util.HashSet;

public class substring {

	public static void subsequences(int i, String str,String newString,Hashset <String>);
	{
		
		if(i==str.length()) {
			System.out.println(newString);
			return;
		}
		char element=str.charAt(i);
		subsequences(i+1,str, newString+element);
		subsequences(i+1,str, newString);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> set = new HashSet<>;
		String str = "abc";
		subsequences(0,str,"",set);
	

	}
	}