package ArrayBasic;
//import java.util.*;
public class secondMax {
	static int secondMaximum(int[] arr) {
		int max=0;
		int secondMax=-1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[max]) {
				secondMax=max;
				max=i;
			}else if(secondMax==-1 || arr[i]>arr[secondMax]) {
				secondMax=i;
			}
		}
		return secondMax;
	}
	 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,4,15,7,12};
		int index=secondMaximum(a);
		
		System.out.println("SecondMaximum is "+ a[index]);
		
	}

}
