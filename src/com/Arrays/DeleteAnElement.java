package Array;

public class DeleteAnElement {
	static int count=5;
	
	public static void main(String [] args)
	{
		
		int arr[] = {12,24,5,33,90};
		
		DeleteAnElement obj1 = new DeleteAnElement();
		
		
		
		public void deleteFromEnd(int arr[])
		{
			if(arr.length <= 0)
				return;
			
			count--;
		}
		
		public void deleteValue(int arr[], int val)
		{
			int i;
			
			for(i=0; i<count; i++)
			{
				if(a[i]==val)
				{
					break;
				}
				
				if(i==count)
				{
					System.out.println("Value does not exist");
					return;
				}
				
				for(int j=1;j<count-1; j++)
				{
					a[j]=a[j-1];
				}
				count--;
			}
			
			public void deleteFromPosition(int arr[], int position)
			{
				if(position>count || position<=0)
				{
					System.out.println("Invalid position");
					return;
				}
				
				for(int i=position-1; i<count-1; i++)
				{
					a[i]=a[i+1];
				}
				
				count--;
			}
			
			public void print(int arr[])
			{
				for(int i=0;i<count; i++)
				{
					System.out.print(arr[i] + "");
				}
				
				System.out.println();
			}	
		}
	}

}
