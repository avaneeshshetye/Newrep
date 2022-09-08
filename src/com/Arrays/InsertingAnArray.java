package Array;

public class InsertingAnArray {

	public static void main(String[] args) {
		
		InsertingAnArray obj1 = new InsertingAnArray();
		
		int count=0;
		int arr[]=new int[5];
		
		arr[0]=9;
		arr[1]=6;
		arr[2]=45;
		arr[3]=63;
		arr[4]=79;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] + " " + i);
		}
		
		public void insert(int a[], int val)
		{
			arr[count++]=val;
		}
		
		

	}

}
