package test;



public class test1
{
	/*public static void sortInPlace(int[] a) 
	
	{		
		int temp = 0;
		int j = 0;
		for(int startOfUnsorted = 0 ; startOfUnsorted<a.length-1 ; startOfUnsorted++)
		{
		    int terminator = 0;
		    int counter = 2;
		    if(a[startOfUnsorted]>a[startOfUnsorted+1])
		    {
		        temp = a[startOfUnsorted];
		        a[startOfUnsorted] = a[startOfUnsorted+1];
		        a[startOfUnsorted+1] = temp;
		        terminator = 1;
		    } 
		    if(a.length>7) 
		    {
		    	counter= counter+a.length-7;
		    }
		    if(startOfUnsorted == a.length-counter-j)
		    {
		        if(terminator!=1) break;
		        startOfUnsorted = -1;
		        j++;		        
		    } 
		}	
	}*/
	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] getRandomArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; ++i) {
			arr[i] = (int) (Math.random() * 100);
		}
		return arr;
	}
	
	public static void checkCustomRadixSort() {
		int iter = 0;
		while (iter < 1000000) {
			int[] newArr = getRandomArray(10);
			int[] sortedNewArr = new int[newArr.length];
			int newArrMax = newArr[0];
			for (int i = 0; i < newArr.length; i++)
				if (newArrMax < newArr[i]) newArrMax = newArr[i];

			int[] array = new int[newArrMax+1];
			for (int i = 0; i < newArr.length; i++)
				array[newArr[i]]++;

			for (int i = 0, j = 0; i < array.length; i++)
				if (array[i] > 0) {
					for (int count = 0; count < array[i]; count++)
						sortedNewArr[j++] = i;
				}

			if (!isSorted(sortedNewArr)) {
				System.out.println("Not sorted!!!");
				for (int idx = 0; idx < sortedNewArr.length; idx++)
					System.out.println(sortedNewArr[idx]);
				break;
			}
			iter++;
			System.out.println("Array was sorted: " + iter);
		}
		System.out.println("Alright, giving up...");
	}
	public static void main(String[] args) {

	    //checkCustomRadixSort();
		int iter = 0;
		while (iter < 1000000) {
			int a[] = getRandomArray(4);
			int temp = 0;
			int j = 0;
			for(int i = 0 ; i<a.length-1 ; i++)
			{
				int tab = 0;
				int counter = 2;
				if(a[i]>a[i+1])
				{
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					tab = 1;
				} 
				if(a.length>7) 
				{
					counter= counter+a.length-7;
				}
				if(i == a.length-counter-j)
				{
					if(tab!=1) break;
					i = -1;
					j++;
				}
			}
			boolean isItSorted = isSorted(a);
			if (!isItSorted) {
				System.out.println("Array is not sorted.");
				for (int idx = 0; idx < a.length; idx++)
					System.out.println(a[idx]);
				break;
			}

			System.out.println("Array was sorted, searching..." + iter);
			iter++;
		}
	
}
}


