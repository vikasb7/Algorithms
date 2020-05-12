// Vikas Bhat
// Selection Sort
// Best-> o(n^2), Worst -> o(n^2)


public class SelectionSort {
	
	public static void main(String[] args)
	{
		int [] arr= new int[] {35,65,30,60,20};
		
		for(int i=0;i<arr.length-1;i++)
		{
			int posmin=i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[posmin])
				{
					posmin=j;
				}
			}
			
			int temp= arr[i];
			arr[i]= arr[posmin];
			arr[posmin]=temp;
		}
		
		for(int k: arr)
		{
			System.out.println(k);
		}
		

		
	}

}
