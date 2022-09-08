package recursion;

public class moveAllx {

public static void moveallX(int i, String str, int count, String newString) {
	
	
	
	
	if(i==str.length()) {
		for(i=0;i<count;i++) {
			newString+='x';
		}
		System.out.println(newString);
		return;
	}
	char element = str.charAt(i);
	if(element == 'x') {
		count++;
		
	}
	else {
		newString+=element;
		
	}
	moveallX(i+1,str,count,newString);
	
	
	
	
}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		moveallX(0,"abxfxghkl",0, "");
		
	}

}
