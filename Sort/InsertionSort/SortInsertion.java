package S21202_java00;

import java.util.Arrays;

public class SortInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dim = {20,19,14,16,18};
		System.out.println("Array Length : " + dim.length);
		int tmp =0;
		for(int i=0; i<dim.length;i++) {
			System.out.print(dim[i]+" ");
		}
		System.out.println();
		for(int i=1;i<dim.length;i++) {
			for(int j=0;j<dim.length;j++) {
				if(dim[i] < dim[j]) {
					tmp = dim[j];
					dim[j] = dim[i];
					dim[i] = tmp;
				}
			}
			System.out.println(Arrays.toString(dim));
			
		}
		System.out.println("--------------------------------------");
		System.out.println(Arrays.toString(dim));
		
		
	}

}
