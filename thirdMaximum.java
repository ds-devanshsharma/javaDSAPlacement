package ArrayBasic;
public class thirdMaximum {
	static int thirdMaximum(int[] arr) {
		int max=0;
		int secondMax=-1;
		int thirdMax=-1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[max]) {
				thirdMax=secondMax;
				secondMax=max;
				max=i;
			}else if(secondMax==-1 || arr[i]>arr[secondMax]) {
				thirdMax=secondMax;
				secondMax=i;
			}else if(arr[i]>thirdMax) {
				thirdMax=i;
			}
		}
		return thirdMax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {11,121,13,14,15};
		int index= thirdMaximum(arr);
		System.out.println("ThirdMaximum is "+ arr[index]);

	}

}
