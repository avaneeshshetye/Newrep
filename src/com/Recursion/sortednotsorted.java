package recursion;

public class sortednotsorted {
	
	public static  boolean sort(int i,int arr[]) {

	if(i==arr.length-1) {
		return true;
	}
	if(arr[i]<arr[i+1]) {
		return sort(i+1,arr);
	}
	else {
		return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,8,7};
		System.out.println(sort(0,arr));
		

	}

}
