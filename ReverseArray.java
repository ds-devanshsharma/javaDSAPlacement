package ArrayBasic;

import java.util.Arrays;

public class ReverseArray {
	static void reverse(int[] arr) {
		int low=0,temp=0;
		int high=arr.length-1;
		while(low<high) {
			 temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {11,12,13,14,15,16};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

}
