package aRRay;

public class Examples_2_1D {
	public static void main(String[] args) {
		int v[]=new int[4];
		v[0]=1;
		v[1]=2;
		v[2]=3;
		v[3]=4;
		System.out.println("---------Print All Values----------");
		for(int i=0; i<v.length;i++) {
			System.out.println(v[i]);
		}
		System.out.println("---------Print All Values----------");
		for(int i=0; i<v.length-1;i++) {
			System.out.println(v[i]);
		}
	}

}