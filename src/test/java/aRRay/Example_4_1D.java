package aRRay;

import java.util.Arrays;

public class Example_4_1D {
	public static void main(String[] args) {
		int l[]=new int[4];
		l[0]=4;
		l[1]=2;
		l[2]=1;
		l[3]=3;
		System.out.println("------Print All Info-------");
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
		}
		
		System.out.println("=========Ascending order=========");
		Arrays.sort(l);
		for(int i=0;i<4;i++) {
			System.out.println(l[i]);
		}
		System.out.println("=========Desending order=========");
		for(int j=3;j>=0;j--) {
			System.out.println(l[j]);
		}
		
	}

}
