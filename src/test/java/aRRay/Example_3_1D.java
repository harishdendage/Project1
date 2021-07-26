package aRRay;

public class Example_3_1D {
	public static void main(String[] args) {
		String ar[]=new String[4];
		ar[0]="Harish";
		ar[1]="Ganesh";
		ar[2]="Sasikant";
		ar[3]="Kishor";
		System.out.println("-----Print in Reverse order-------");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
			
		}
	}

}
