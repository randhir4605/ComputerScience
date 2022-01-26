package learn.dsalgo;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {4,2,1,6,3,7,2,9,4,10,1};
		outerloop:for(int i=0;i<arr.length;i++) {
			boolean swapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
			}
			if(!swapped) break outerloop;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
