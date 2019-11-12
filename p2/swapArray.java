package p2;

import java.util.Arrays;
import java.util.Scanner;

public class swapArray {

	private static void swap(int[] A, int i, int j) {
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
	public static void rearrangeArray(int[] A)
	{
		for(int i=1;i<A.length;i+=2) {
			if(A[i-1]>A[i]) {
				swap(A,i-1,i);
			}
			if(i+1<A.length && A[i+1]>A[i]) {
				swap(A,i+1,i);
			}
		}
	}
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int[] A= {9,6,8,3,7};
		//int[] A= new int[100];
		
		System.out.print("입력할 숫자 개수 :");

		rearrangeArray(A);
		System.out.println(Arrays.toString(A));
	}

}
