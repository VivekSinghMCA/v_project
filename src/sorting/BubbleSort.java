package sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		System.out.println("unsorted array");
		int a[]= {16,20,14,18,12,20};
		System.out.println("array without sorting");
		System.out.println(Arrays.toString(a));
		a=sort(a);
		System.out.println("array after sorting");
		System.out.println(Arrays.toString(a));
	}
		public static int[] sort(int[] a)
		{
		for(int i = 0; i<a.length-1; i++ )
		{
			System.out.println(a[i] + " ");
			int x = 0;
			
			for(int j = 0; j<a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					a[j] = a[j] + a[j+1];
					a[j+1] = a[j]-a[j+1];
					a[j] = a[j] - a[j+1];
					x=1;
					
				}
			}
			if(x==0)
			{
				break;
			}	
		}
		return a;
		}
}


