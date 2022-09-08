package Array;

public class NumberoE {


public static void largest(int arr[])
{
	int largest = arr[0];
	for(int i = 0;i<arr.length;i++)
	{
		if(largest<arr[i]) {
			largest=arr[i];
		}
	}
	System.out.println("Largest number from the value: " + largest);
}
	public static void main(String[] args) {
		
		int arr[] = {4,7,3,2};
		largest(arr);

	}

}
