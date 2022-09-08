package Array;

public class Binary_Search {
	
	public static void BinarySearch(int arr[], int start, int end, int key) {
		
		int mid = (start+end)/2;
		
		if(arr[mid]==key) {
			System.out.println(mid);
		}
		
		else if(arr[mid]>key) {
			start=mid+1;
		}
		else {
			end=mid-1;
		}
		
		
	}
	public static void main(String[]args) {
		int [] arr = {3,5,21,9};
		int key = 21;
		int end =arr.length-1;
		BinarySearch(arr,0,end,key);
		
		
}
}