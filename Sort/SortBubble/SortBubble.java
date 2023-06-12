package S21202_java00;

import java.util.Arrays;

public class SortBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dim = {6,3,11,8,1,5,9,0,2,4,10,7,-1,2,-9};
		int temp=0;
		
		for(int i=0; i<dim.length;i++) {
			System.out.print(dim[i]+" ");
		}
		System.out.println();
		for(int i=0;i<dim.length-1;i++) {
			for(int j=0;j<dim.length-1;j++) {
				if(dim[j] > dim[j+1]) {
					temp = dim[j+1];
					dim[j+1] = dim[j];
					dim[j] = temp;
					System.out.println(Arrays.toString(dim));
				}
			}
		}
		System.out.println("--------------------------------------");
		System.out.println(Arrays.toString(dim));
		
	}
}
