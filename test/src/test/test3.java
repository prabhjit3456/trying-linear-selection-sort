package test;

public class test3 
{
	public static void swapper(int[] arr) 
	{
		for(int i = 0 ; i<arr.length/2;i++) 
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp; 
		}
	}
	public static void main(String[] args) 
	{
		int[] aaj = {1,2,3,4,5,6,7,8};
		swapper(aaj);
		int[] a = new int[18];
		for(int i = 0; i <aaj.length; i++) 
		{
			System.out.print(aaj[i] + " ");
		}
		for(int i = 0; i<10;i++) 
		{
			a[i]=0+i;
			
		}
		a[11]=111;
		int index = 0;
		for(int i = 0; i<17;i++) 
		{
			if(i>2) 
			{
				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
				index++;				
			}
			System.out.print(a[i]);
		}
	}	
}
