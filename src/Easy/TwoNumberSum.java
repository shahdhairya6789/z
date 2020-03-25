package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TwoNumberSum {

//  Time Complexity=O(nlogn) Space=O(n)
	List<Integer> twoPointer(int a[],int target)
	{

		List<Integer> al=new ArrayList<Integer>();
		int l=0,r=a.length-1;
		Arrays.sort(a);
		while(l<r)
		{
			if(a[l]+a[r]==target)
			{
				al.add(a[l]);
				al.add(a[r]);
				l++;
				r--;
			}
			else if(a[l]+a[r]<target)
			{
				l++;
			}
			else
			{
				r--;
			}
		}
		return al;
	}
	
	
	//   Time Complexity=O(n) Space=O(n)
	List<Integer> hashsum(int a[],int target)
	{
		HashSet<Integer> h=new HashSet<>();
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(h.contains(target-a[i]))
			{
				al.add(a[i]);
				al.add(target-a[i]);
			}
			else
			{
				h.add(a[i]);
			}
		}
		return al;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5,6,7,8,9,11};
		int target=10;
		//ArrayList<Integer> al = (ArrayList<Integer>)new TwoNumberSum().twoPointer(a,target);
		ArrayList<Integer> al = (ArrayList<Integer>)new TwoNumberSum().hashsum(a,target);
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
			i++;
			System.out.println(al.get(i));
		}
	}
}
